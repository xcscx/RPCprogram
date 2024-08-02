package com.xtx.proxy;

import java.lang.reflect.Proxy;

public class ServiceProxyFactory {

    /**
     * 依据服务类获取代理对象
     */
    public static <T> T getProxy(Class<T> serviceClass) {
        return (T) Proxy.newProxyInstance(
                serviceClass.getClassLoader(),
                new Class[]{serviceClass},
                new ServiceProxy());
    }

}
