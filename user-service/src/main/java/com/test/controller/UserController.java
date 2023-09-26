package com.test.controller;

import com.test.entity.User;
import com.test.service.UserService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 用户 api 接口类
 *
 * @Author YouZhi
 * @Date 2023 - 09 - 26 - 20:16
 */

@RestController
public class UserController {

    @Resource
    private UserService userService;

    @RequestMapping("/user/{uid}")
    public User findUserById(@PathVariable("uid") int uid){
        return userService.getUserById(uid);
    }

}
