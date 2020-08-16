package com.yxd.cuisine.impl;


import com.yxd.CacheServiceGeneral;
import org.junit.Test;

public class CacheServiceGeneralImplTest {

    @Test
    public void test_cacheServiceGeneral() {
        CacheServiceGeneral cacheServiceGeneral = new CacheServiceGeneralImpl();
        cacheServiceGeneral.set("username_01", "三亩地", 1);
        String val = cacheServiceGeneral.get("username_01", 1);
        System.out.println(val);
    }
}