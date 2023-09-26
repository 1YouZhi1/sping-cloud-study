package com.test.controller;

import com.test.entity.Book;
import com.test.service.BookService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 书籍接口类
 *
 * @Author YouZhi
 * @Date 2023 - 09 - 26 - 21:31
 */
@RestController
public class BookController {

    @Resource
    private BookService bookService;

    @RequestMapping("/book/{bid}")
    public Book findBookById(@PathVariable("bid") int bid){
        return bookService.getBookById(bid);
    }

}
