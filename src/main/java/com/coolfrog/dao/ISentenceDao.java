package com.coolfrog.dao;

import com.coolfrog.domain.Sentence;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * 课文单词、句子表 Mapper 接口
 * </p>
 *
 * @author watson
 * @since 2023-06-20
 */
@Mapper
public interface ISentenceDao extends BaseMapper<Sentence> {

}
