package com.coolfrog.dao;

import com.coolfrog.domain.Lesson;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * 课文表 Mapper 接口
 * </p>
 *
 * @author watson
 * @since 2023-02-24
 */
@Mapper
public interface ILessonDao extends BaseMapper<Lesson> {

}
