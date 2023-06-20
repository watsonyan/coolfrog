package com.coolfrog.dao;

import com.coolfrog.domain.Oauth;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * 用户登录授权表 Mapper 接口
 * </p>
 *
 * @author watson
 * @since 2023-06-20
 */
@Mapper
public interface IOauthDao extends BaseMapper<Oauth> {

}
