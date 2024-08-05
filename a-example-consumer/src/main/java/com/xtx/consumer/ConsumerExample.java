package com.xtx.consumer;

import com.xtx.common.model.User;
import com.xtx.common.service.UserService;
import com.xtx.proxy.ServiceProxyFactory;

public class ConsumerExample {

    public static void main(String[] args) {
        // 获取代理
        UserService userService = ServiceProxyFactory.getProxy(UserService.class);
        User user = new User();
        user.setName("super-xtx");
        // 调用
        User newUser = userService.getUser(user);
        if(newUser != null) {
            System.out.println(newUser.getName());
        } else {
            System.out.println("user == null");
        }
        long number = userService.getNumber();
        System.out.println(number);
    }

}
