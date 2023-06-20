package com.coolfrog.service.impl;

import com.coolfrog.domain.Book;
import com.coolfrog.dao.IBookDao;
import com.coolfrog.service.IBookService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 书本表 服务实现类
 * </p>
 *
 * @author watson
 * @since 2023-02-24
 */
@Service
public class BookServiceImp extends ServiceImpl<IBookDao, Book> implements IBookService {

    @Override
    public PageInfo<Book> getPageBooks(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<Book> books = list();
        PageInfo<Book> pageBooks = new PageInfo<>(books);
        return pageBooks;
    }
}
