package com.wangzz.example;

import com.wangzz.example.common.model.User;
import com.wangzz.example.common.service.UserService;

public class EasyConsumerExample {
    public static void main(String[] args) {
        // todo 需要获取userService的实现类对象
        UserService userService = null;
        User user = new User();
        user.setName("wangzz");
        User newUser = userService.getUser(user);
        if (newUser != null) {
            System.out.println(newUser.getName());
        } else {
            System.out.println("user==null");
        }

    }
}
