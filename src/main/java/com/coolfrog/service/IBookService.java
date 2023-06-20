package com.coolfrog.service;

import com.coolfrog.domain.Book;
import com.baomidou.mybatisplus.extension.service.IService;
import com.github.pagehelper.PageInfo;

/**
 * <p>
 * 书本表 服务类
 * </p>
 *
 * @author watson
 * @since 2023-02-24
 */
public interface IBookService extends IService<Book> {
    PageInfo<Book> getPageBooks(int pageNum, int pageSize);
}
