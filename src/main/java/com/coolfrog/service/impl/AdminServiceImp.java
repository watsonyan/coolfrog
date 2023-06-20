package com.coolfrog.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.coolfrog.domain.Admin;
import com.coolfrog.dao.IAdminDao;
import com.coolfrog.service.IAdminService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 后台管理员表 服务实现类
 * </p>
 *
 * @author watson
 * @since 2023-06-19
 */
@Service
public class AdminServiceImp extends ServiceImpl<IAdminDao, Admin> implements IAdminService {
    @Autowired
    IAdminDao adminDao;

    @Override
    public Admin getAdminByName(String username) {
        QueryWrapper<Admin> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("nickname", username);
        return adminDao.selectOne(queryWrapper);
    }
}
