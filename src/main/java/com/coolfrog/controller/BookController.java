package com.coolfrog.controller;

import com.alibaba.fastjson.JSONObject;
import com.coolfrog.domain.Book;
import com.coolfrog.service.IBookService;
import com.coolfrog.util.ResponseUtil;
import com.coolfrog.util.Result;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {
    @Autowired
    private IBookService bookService;

    @GetMapping
    public Result getBooks() {
        List<Book> books = bookService.list();
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("books", books);
        return ResponseUtil.ok(jsonObject);
    }

    @GetMapping("/page/{pageSize}/{pageNum}")
    public Result getPageBooks(@PathVariable int pageNum, @PathVariable int pageSize) {
        PageInfo<Book> pageBooks = bookService.getPageBooks(pageNum, pageSize);
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("books", pageBooks);
        return ResponseUtil.ok(jsonObject);
    }

    @GetMapping("/{id}")
    public Result getBookById(@PathVariable Long id) {
        Book book = bookService.getById(id);
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("book", book);
        return ResponseUtil.ok(jsonObject);
    }

    @PostMapping
    public Boolean save(@ModelAttribute Book book) {
        return bookService.saveOrUpdate(book);
    }
}
