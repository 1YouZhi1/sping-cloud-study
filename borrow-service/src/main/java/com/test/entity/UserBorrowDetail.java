package com.test.entity;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * 返回Borrow详情
 *
 * @Author YouZhi
 * @Date 2023 - 09 - 26 - 23:13
 */
@Data
@AllArgsConstructor
public class UserBorrowDetail {

    private User user;

    private List<Book> bookList;

}
