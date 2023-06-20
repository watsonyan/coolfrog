package com.coolfrog.service;

import com.coolfrog.domain.Admin;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 后台管理员表 服务类
 * </p>
 *
 * @author watson
 * @since 2023-06-19
 */
public interface IAdminService extends IService<Admin> {
    Admin getAdminByName(String username);
}
