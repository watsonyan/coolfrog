package com.coolfrog.service;

import com.coolfrog.domain.User;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 用户表 服务类
 * </p>
 *
 * @author watson
 * @since 2023-02-24
 */
public interface IUserService extends IService<User> {
    User getUserByOId(String openId);
}
