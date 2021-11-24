package com.egsee.demo.service.impl;

import com.egsee.demo.mapper.UserMapper;
import com.egsee.demo.model.User;
import com.egsee.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User getByName(User user) {
        return userMapper.getByName(user);
    }
}
