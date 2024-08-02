package com.xtx.provider;

import com.xtx.common.service.UserService;
import com.xtx.registry.LocalRegistry;
import com.xtx.server.HttpServer;
import com.xtx.server.VertxHttpServer;

public class EasyProviderExample {

    public static void main(String[] args) {
        //提供服务
        LocalRegistry.register(UserService.class.getName(), UserServiceImpl.class);

        //启动web服务
        HttpServer httpServer = new VertxHttpServer();
        httpServer.doStart(8080);
    }

}
