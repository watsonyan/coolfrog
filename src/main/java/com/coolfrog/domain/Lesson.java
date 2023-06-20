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
 * @since 2023-06-20
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
     * 课文主要单词ids
     */
    private String wordIds;

    /**
     * 课文句子ids
     */
    private String sentenceIds;

    /**
     * 状态，0：禁用，1：启用
     */
    private Integer status;
}
