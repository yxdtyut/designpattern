package com.yxd.impl;

import com.yxd.CacheServiceRight;
import com.yxd.CglibProxy;
import com.yxd.RedisUtil;
import com.yxd.factory.impl.EGMCacheAdapter;
import com.yxd.factory.impl.IIRCacheAdapter;

import java.util.concurrent.TimeUnit;

/**
 * @author yangxudong
 * @description:
 * @date 2020/8/16 19:51
 */
public class CacheServiceRightImpl implements CacheServiceRight {
    private RedisUtil redisUtil = CglibProxy.getProxy(RedisUtil.class, new IIRCacheAdapter());

    @Override
    public String get(String key) {
        return redisUtil.get(key);
    }

    @Override
    public void set(String key, String value) {
        redisUtil.set(key, value);
    }

    @Override
    public void set(String key, String value, long timeout, TimeUnit timeUnit) {
        redisUtil.set(key, value, timeout, timeUnit);
    }

    @Override
    public void del(String key) {
        redisUtil.del(key);
    }
}
