package com.yxd.impl;


import com.yxd.CacheServiceRight;
import com.yxd.cuisine.impl.CacheServiceImpl;
import org.junit.Test;

public class CacheServiceRightImplTest {
    @Test
    public void test_CacheServiceRight() {
        CacheServiceRight cacheService = new CacheServiceRightImpl();
        cacheService.set("libai", "李白");
        String libai = cacheService.get("libai");
        System.out.println(libai);
    }
}