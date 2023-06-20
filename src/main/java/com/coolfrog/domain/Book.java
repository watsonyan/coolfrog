package com.coolfrog.domain;

import com.baomidou.mybatisplus.annotation.TableName;
import com.coolfrog.domain.BaseDomain;
import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 书本表
 * </p>
 *
 * @author watson
 * @since 2023-06-20
 */
@Getter
@Setter
@TableName("tbl_book")
public class Book extends BaseDomain {

    private static final long serialVersionUID = 1L;

    /**
     * 级别
     */
    private Byte level;

    /**
     * 书名
     */
    private String name;

    /**
     * 封面图片
     */
    private String cover;

    /**
     * 状态，0：禁用，1：启用
     */
    private Integer status;
}
