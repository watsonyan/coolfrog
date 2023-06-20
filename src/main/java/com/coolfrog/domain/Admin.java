package com.coolfrog.domain;

import com.baomidou.mybatisplus.annotation.TableName;
import com.coolfrog.domain.BaseDomain;
import java.io.Serializable;
import java.time.LocalDateTime;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 后台管理员表
 * </p>
 *
 * @author watson
 * @since 2023-06-20
 */
@Getter
@Setter
@TableName("tbl_admin")
public class Admin extends BaseDomain {

    private static final long serialVersionUID = 1L;

    /**
     * 用户昵称
     */
    private String nickname;

    /**
     * 加密后的密码
     */
    private String password;

    /**
     * 上次登录时间
     */
    private LocalDateTime lastLoginTime;
}
