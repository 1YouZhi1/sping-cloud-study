package com.test.service;


import com.test.entity.Book;

/**
 * 书籍 服务类
 *
 * @Author YouZhi
 * @Date 2023 - 09 - 26 - 21:28
 */
public interface BookService {

    /**
     * 通过id查询书籍信息
     * @param id
     * @return
     */
    Book getBookById(int id);
}
