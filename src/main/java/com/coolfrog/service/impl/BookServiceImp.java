package com.coolfrog.service.impl;

import com.coolfrog.domain.Book;
import com.coolfrog.dao.IBookDao;
import com.coolfrog.service.IBookService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

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

}
