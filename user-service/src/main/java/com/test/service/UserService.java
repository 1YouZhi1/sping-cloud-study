package com.test.service;

import com.test.entity.User;

/**
 * 用户 服务类
 *
 * @Author YouZhi
 * @Date 2023 - 09 - 26 - 19:59
 */
public interface UserService {
    /**
     * 通过获取id获取用户
     * @param id
     * @return
     */
    User getUserById(Integer id);
}
