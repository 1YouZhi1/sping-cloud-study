package com.test.service.impl;

import com.test.entity.User;
import com.test.mapper.UserMapper;
import com.test.service.UserService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

/**
 * 用户 服务实现类
 *
 * @Author YouZhi
 * @Date 2023 - 09 - 26 - 20:00
 */
@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;


    @Override
    public User getUserById(Integer id) {
        User user = userMapper.selectById(id);
        return user;
    }
}
