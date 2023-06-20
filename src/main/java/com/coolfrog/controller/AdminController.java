package com.coolfrog.controller;

import com.alibaba.fastjson.JSONObject;
import com.coolfrog.domain.Admin;
import com.coolfrog.service.IAdminService;
import com.coolfrog.util.ResponseUtil;
import com.coolfrog.util.Result;
import com.coolfrog.util.UserTokenManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

/**
 * <p>
 * 后台管理员表 前端控制器
 * </p>
 *
 * @author watson
 * @since 2023-06-19
 */
@RestController
@RequestMapping("/admin")
public class AdminController {
    @Autowired
    IAdminService adminService;

    @PostMapping("/login")
    public Result adminLogin(@RequestBody Admin user, HttpServletRequest request) {
//        String username = map.get("username");
        Admin admin = adminService.getAdminByName(user.getNickname());
        if (admin == null) {
            return  ResponseUtil.fail("user is not exist");
        } else if (admin.getPassword().equals(user.getPassword())) {
            String token = UserTokenManager.generateToken(admin.getId());
            JSONObject jsonData = new JSONObject();
            jsonData.put("token", token);
            jsonData.put("user", admin);
            return ResponseUtil.ok(jsonData);
        }
        return ResponseUtil.fail("Login failed");
    }
}
