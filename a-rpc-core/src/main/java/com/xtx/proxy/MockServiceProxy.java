package com.xtx.proxy;

import lombok.extern.slf4j.Slf4j;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

@Slf4j
public class MockServiceProxy implements InvocationHandler {

    /**
     * 调用代理
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        // 根据方法的返回值，生成特定的默认值对象
        Class<?> methodReturnType = method.getReturnType();
        log.info("mock invock {}", method.getName());
        return getDefaultObject(methodReturnType);
    }

    /**
     * 生成指定类型的默认值对象
     */
    private Object getDefaultObject(Class<?> type) {
        //基本类型
        if(type.isPrimitive()) {
            if(type == boolean.class) {
                return false;
            } else if(type == short.class) {
                return (short) 0;
            } else if(type == int.class) {
                return 0;
            } else if(type == long.class) {
                return 0L;
            }
        }
        return null;
    }

}
