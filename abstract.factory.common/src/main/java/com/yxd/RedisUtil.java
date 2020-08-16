package com.yxd;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;

/**
 * @author yangxudong
 * @description:
 * @date 2020/8/11 23:10
 */
public class RedisUtil {
    private Logger logger = LoggerFactory.getLogger(RedisUtil.class);

    private Map<String, String> dataMap = new ConcurrentHashMap<>();

    public String get(String key) {
        logger.info("redis获取数据, key:{}", key);
        return dataMap.get(key);
    }

    public void set(String key, String value) {
        logger.info("redis写入数据, key:{}, value:{}", key, value);
        dataMap.put(key, value);
    }

    public void set(String key, String value, long timeout, TimeUnit timeUnit) {
        logger.info("Redis写入数据 key:{} value:{} timeout:{} timeUtil:{}", key, value, timeout, timeUnit);
        dataMap.put(key, value);
    }

    public void del(String key) {
        logger.info("redis删除数据 key:{}", key);
        dataMap.remove(key);
    }
}
