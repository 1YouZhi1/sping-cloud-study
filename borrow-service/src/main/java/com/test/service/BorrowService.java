package com.test.service;

import com.test.entity.UserBorrowDetail;

/**
 * @Author YouZhi
 * @Date 2023 - 09 - 26 - 22:50
 */
public interface BorrowService {

    /**
     * 获取用户借的全部书籍记录
     * @param uid
     * @return
     */
    UserBorrowDetail getUserBorrowDetailByUid(int uid);

}
