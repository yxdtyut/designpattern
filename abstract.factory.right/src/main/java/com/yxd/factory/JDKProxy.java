package com.yxd.factory;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @author yangxudong
 * @description:
 * @date 2020/8/16 20:13
 */
public class JDKProxy {
    public static <T> T getProxy(Class<T> interfaceClass, ICacheAdapter cacheAdapter) {
        InvocationHandler invocationHandler = new JDKInvocationHandler(cacheAdapter);
        return (T) Proxy.newProxyInstance(Thread.currentThread().getContextClassLoader(), new Class[]{interfaceClass.getInterfaces()[0]}, invocationHandler);
    }
}
