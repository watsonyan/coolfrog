package com.coolfrog.domain;

import com.baomidou.mybatisplus.annotation.TableName;
import com.coolfrog.domain.BaseDomain;
import java.io.Serializable;
import java.time.LocalDateTime;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 用户表
 * </p>
 *
 * @author watson
 * @since 2023-02-24
 */
@Getter
@Setter
@TableName("tbl_user")
public class User extends BaseDomain {

    private static final long serialVersionUID = 1L;

    /**
     * 用户昵称
     */
    private String nickname;

    /**
     * 加密后的密码
     */
    private String password;

    private Byte gender;

    /**
     * 手机号码
     */
    private String mobile;

    private Integer coin;

    /**
     * 用户头像
     */
    private String avatar;

    private String province;

    /**
     * 状态，0：禁用，1：启用
     */
    private Integer status;

    /**
     * openid
     */
    private String openid;

    /**
     * session key
     */
    private String sessionKey;

    /**
     * 上次登录时间
     */
    private LocalDateTime lastLoginTime;
}
