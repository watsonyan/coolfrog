package com.coolfrog.domain;

import com.baomidou.mybatisplus.annotation.TableName;
import com.coolfrog.domain.BaseDomain;
import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 课文表
 * </p>
 *
 * @author watson
 * @since 2023-02-24
 */
@Getter
@Setter
@TableName("tbl_lesson")
public class Lesson extends BaseDomain {

    private static final long serialVersionUID = 1L;

    /**
     * 级别
     */
    private Byte bookId;

    /**
     * 标题
     */
    private String title;

    /**
     * 封面图片
     */
    private String cover;

    /**
     * 状态，0：禁用，1：启用
     */
    private Integer status;
}
