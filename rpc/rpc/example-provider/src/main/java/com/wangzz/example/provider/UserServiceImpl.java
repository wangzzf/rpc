package com.wangzz.example.provider;

import com.wangzz.example.common.model.User;
import com.wangzz.example.common.service.UserService;

public class UserServiceImpl implements UserService {
    public User getUser(User user) {

        System.out.println("用户名" + user.getName());
        return user;
    }
}
