package com.test.controller;

import com.test.entity.UserBorrowDetail;
import com.test.service.BorrowService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @Author YouZhi
 * @Date 2023 - 09 - 26 - 23:59
 */
@RestController
public class BorrowController {

    @Resource
    private BorrowService borrowService;

    @RequestMapping("/borrow/{uid}")
    UserBorrowDetail findUserBorrows(@PathVariable("uid") int uid){
        return borrowService.getUserBorrowDetailByUid(uid);
    }

}
