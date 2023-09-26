package com.test.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.test.entity.Book;
import com.test.mapper.BookMapper;
import com.test.service.BookService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

/**
 * 书籍 实现类
 *
 * @Author YouZhi
 * @Date 2023 - 09 - 26 - 21:29
 */
@Service
public class BookServiceImpl implements BookService {

    @Resource
    private BookMapper bookMapper;

    @Override
    public Book getBookById(int id) {
        QueryWrapper<Book> queryWrapper = new QueryWrapper<>();
        queryWrapper.select("*")
                .eq("bid", id);
        return bookMapper.selectOne(queryWrapper);
    }
}
