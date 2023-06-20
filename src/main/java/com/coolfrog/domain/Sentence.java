package com.coolfrog.domain;

import com.baomidou.mybatisplus.annotation.TableName;
import com.coolfrog.domain.BaseDomain;
import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 课文单词、句子表
 * </p>
 *
 * @author watson
 * @since 2023-06-20
 */
@Getter
@Setter
@TableName("tbl_sentence")
public class Sentence extends BaseDomain {

    private static final long serialVersionUID = 1L;

    /**
     * 所属课文id
     */
    private Long lessonId;

    private Byte seqId;

    /**
     * 文本内容
     */
    private String content;

    /**
     * 图片
     */
    private String image;

    /**
     * 音频
     */
    private String audio;

    /**
     * 是否为单词
     */
    private Byte isWord;

    /**
     * 状态，0：禁用，1：启用
     */
    private Byte status;
}
