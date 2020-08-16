package com.yxd;

import java.util.concurrent.TimeUnit;

/**
 * @author yangxudong
 * @description:
 * @date 2020/8/16 19:50
 */
public interface CacheServiceRight {
    String get(final String key);

    void set(String key, String value);

    void set(String key, String value, long timeout, TimeUnit timeUnit);

    void del(String key);
}
