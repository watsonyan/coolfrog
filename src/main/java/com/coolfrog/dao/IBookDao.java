package com.coolfrog.dao;

import com.coolfrog.domain.Book;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * 书本表 Mapper 接口
 * </p>
 *
 * @author watson
 * @since 2023-02-24
 */
@Mapper
public interface IBookDao extends BaseMapper<Book> {

}
