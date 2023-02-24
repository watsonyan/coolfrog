package com.coolfrog.service;

import com.coolfrog.domain.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class BookServiceTest {
    @Autowired
    IBookService bookService;

    @Test
    void addBook() {
        Book book = new Book();
        book.setName("xxx");
        book.setCover("https://cdn.xcx.huochaibox.com/onlineTest/uploadFile/2023/02/15/QdrezXp.jpg");
        assert bookService.save(book);
    }
    @Test
    void getBookById() {
        Book book = bookService.getById(1L);
        System.out.println(book.toString());
        assert book.getId() == 1L;
    }


    @Test
    void updateBook() {
        Book book = bookService.getById(1L);
        book.setName("aaa");
        assert bookService.saveOrUpdate(book);
    }

    @Test
    void getBooks() {
        List<Book> books = bookService.list();
        books.forEach(book -> {
            System.out.println(book.toString());
        });
    }
}