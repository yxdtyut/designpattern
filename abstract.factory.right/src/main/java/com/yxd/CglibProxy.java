package com.yxd;

import com.yxd.factory.CglibMethodInterceptor;
import com.yxd.factory.ICacheAdapter;
import net.sf.cglib.proxy.Enhancer;

/**
 * @author yangxudong
 * @description:
 * @date 2020/8/16 20:34
 */
public class CglibProxy {
    public static <T> T getProxy(Class<T> clazz, ICacheAdapter cacheAdapter) {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(clazz);
        enhancer.setCallback(new CglibMethodInterceptor(cacheAdapter));
        return  (T) enhancer.create();
    }
}
