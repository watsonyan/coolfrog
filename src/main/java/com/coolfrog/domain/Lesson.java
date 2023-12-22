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
 * @since 2023-12-22
 */
@Getter
@Setter
@TableName("tbl_lesson")
public class Lesson extends BaseDomain {

    private static final long serialVersionUID = 1L;

    /**
     * 书本id
     */
    private Long bookId;

    /**
     * 标题
     */
    private String title;

    /**
     * 状态，0：禁用，1：启用
     */
    private Integer status;

    /**
     * 文本内容
     */
    private String content;

    /**
     * 音频
     */
    private String audio;
}
