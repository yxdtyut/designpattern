package com.yxd.factory;

import com.yxd.factory.ICacheAdapter;
import com.yxd.util.ClassLoaderUtils;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author yangxudong
 * @description:
 * @date 2020/8/16 20:32
 */
public class CglibMethodInterceptor implements MethodInterceptor {

    private ICacheAdapter cacheAdapter;

    public CglibMethodInterceptor(ICacheAdapter cacheAdapter) {
        this.cacheAdapter = cacheAdapter;
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        return ICacheAdapter.class.getMethod(method.getName(), ClassLoaderUtils.getClazzByArgs(objects)).invoke(cacheAdapter, objects);
    }
}
