package com.xtx.consumer;

import com.xtx.common.model.User;
import com.xtx.common.service.UserService;
import com.xtx.config.RpcConfig;
import com.xtx.proxy.ServiceProxyFactory;
import com.xtx.utils.ConfigUtils;

public class EasyConsumerExample {

    public static void main(String[] args) {
        //todo 需要获取 UserService 的实现类对象
        UserService userService = ServiceProxyFactory.getProxy(UserService.class);
        User user = new User();
        user.setName("xtx");
        User newUser = userService.getUser(user);
        if(newUser != null) {
            System.out.println(newUser.getName());
        } else {
            System.out.println("user == null");
        }
//        RpcConfig rpc = ConfigUtils.loadConfig(RpcConfig.class, "rpc");
//        System.out.println(rpc);
    }

}
