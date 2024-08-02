package com.xtx.provider;

import com.xtx.common.model.User;
import com.xtx.common.service.UserService;

public class UserServiceImpl implements UserService {

    public User getUser(User user) {
        System.out.println("用户名" + user.getName());
        return user;
    }

}
