package com.coolfrog.service.impl;

import com.coolfrog.domain.Oauth;
import com.coolfrog.dao.IOauthDao;
import com.coolfrog.service.IOauthService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户登录授权表 服务实现类
 * </p>
 *
 * @author watson
 * @since 2023-02-24
 */
@Service
public class OauthServiceImp extends ServiceImpl<IOauthDao, Oauth> implements IOauthService {

}
