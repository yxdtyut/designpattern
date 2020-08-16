package com.yxd.cuisine.impl;

import com.yxd.CacheService;
import com.yxd.RedisUtil;

import java.util.concurrent.TimeUnit;

/**
 * @author yangxudong
 * @description:
 * @date 2020/8/11 23:19
 */
public class CacheServiceImpl implements CacheService {
    private RedisUtil redisUtils = new RedisUtil();

    public String get(String key) {
        return redisUtils.get(key);
    }

    public void set(String key, String value) {
        redisUtils.set(key, value);
    }

    public void set(String key, String value, long timeout, TimeUnit timeUnit) {
        redisUtils.set(key, value, timeout, timeUnit);
    }

    public void del(String key) {
        redisUtils.del(key);
    }
}
