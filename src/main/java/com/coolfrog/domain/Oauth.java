package com.coolfrog.domain;

import com.baomidou.mybatisplus.annotation.TableName;
import com.coolfrog.domain.BaseDomain;
import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 用户登录授权表
 * </p>
 *
 * @author watson
 * @since 2023-02-24
 */
@Getter
@Setter
@TableName("tbl_oauth")
public class Oauth extends BaseDomain {

    private static final long serialVersionUID = 1L;

    /**
     * 用户id
     */
    private Long uid;

    /**
     * openid
     */
    private String openid;
}
