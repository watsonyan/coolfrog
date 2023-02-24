package com.coolfrog.controller;

import cn.binarywang.wx.miniapp.api.WxMaService;
import cn.binarywang.wx.miniapp.bean.WxMaJscode2SessionResult;
import com.alibaba.fastjson.JSONObject;
import com.coolfrog.domain.User;
import com.coolfrog.service.IUserService;
import com.coolfrog.util.ResponseUtil;
import com.coolfrog.util.Result;
import com.coolfrog.util.UserTokenManager;
import me.chanjar.weixin.common.error.WxErrorException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.time.LocalDateTime;
import java.util.Map;

@RestController
public class WxAuthController {
    @Autowired
    WxMaService wxService;

    @Autowired
    IUserService userService;

    @PostMapping("/login")
    public Result wxLogin(@RequestParam Map<String, String> map, HttpServletRequest request) {
        String code = map.get("code");
        System.out.println("wxLogin with code: " + code);

        String sessionKey = null;
        String openId = null;
        String unionId = null;
        try {
            WxMaJscode2SessionResult sessionInfo = wxService.getUserService().getSessionInfo(code);
            sessionKey = sessionInfo.getSessionKey();
            openId = sessionInfo.getOpenid();
//            unionId = sessionInfo.getUnionid();
        } catch (WxErrorException e) {
            e.printStackTrace();
        }
        if (sessionKey == null || openId == null) {
            System.out.println("can't get openid");
            return ResponseUtil.fail("can't get openid");
        }

        User user = userService.getUserByOId(openId);
        if (user == null) {
            // 新用户
            user = new User();
            user.setPassword(openId);
            user.setOpenid(openId);
            user.setNickname("用户_" + user.getId());
            user.setLastLoginTime(LocalDateTime.now());
//            user.setLastLoginIp(IpUtil.getIpAddr(request));
            user.setSessionKey(sessionKey);
            userService.save(user);
        } else {
            user.setLastLoginTime(LocalDateTime.now());
//            user.setLastLoginIp(IpUtil.getIpAddr(request));
            user.setSessionKey(sessionKey);
            if (userService.updateById(user)) {
                return ResponseUtil.fail("登录失败");
            }
        }

        String token = UserTokenManager.generateToken(user.getId());
        JSONObject jsonData = new JSONObject();
        jsonData.put("token", token);
        jsonData.put("user", user);
        return ResponseUtil.ok(jsonData);
    }

    public Result LoginWithOpenId(@RequestParam Map<String, String> map){
        String openId = map.get("openId");
        User user = userService.getUserByOId(openId);
        if (user == null) {
            // 新用户
            user = new User();
            user.setPassword(openId);
            user.setOpenid(openId);
            user.setNickname("用户_" + user.getId());
            user.setLastLoginTime(LocalDateTime.now());
            user.setSessionKey(openId);
            userService.save(user);
        } else {
            user.setLastLoginTime(LocalDateTime.now());
            user.setSessionKey(openId);
            if (userService.updateById(user)) {
                return ResponseUtil.fail("登录失败");
            }
        }

        String token = UserTokenManager.generateToken(user.getId());
        JSONObject jsonData = new JSONObject();
        jsonData.put("token", token);
        jsonData.put("user", user);
        return ResponseUtil.ok(jsonData);
    }
}
