package com.coolfrog.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.coolfrog.domain.User;
import com.coolfrog.dao.IUserDao;
import com.coolfrog.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户表 服务实现类
 * </p>
 *
 * @author watson
 * @since 2023-02-24
 */
@Service
public class UserServiceImp extends ServiceImpl<IUserDao, User> implements IUserService {
    @Autowired
    IUserDao userDao;

    @Override
    public User getUserByOId(String openId) {
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("openid", openId);
        return userDao.selectOne(queryWrapper);
    }
}
