package com.coolfrog.dao;

import com.coolfrog.domain.Admin;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * 后台管理员表 Mapper 接口
 * </p>
 *
 * @author watson
 * @since 2023-06-20
 */
@Mapper
public interface IAdminDao extends BaseMapper<Admin> {

}
