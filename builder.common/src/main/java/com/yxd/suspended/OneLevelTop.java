package com.yxd.suspended;

import com.yxd.Material;

import java.math.BigDecimal;

/**
 * @author yangxudong
 * @description:
 * @date 2020/8/23 16:04
 */
public class OneLevelTop implements Material {
    @Override
    public String purpose() {
        return "吊顶";
    }

    @Override
    public String brand() {
        return "一级顶";
    }

    @Override
    public BigDecimal price() {
        return new BigDecimal(60);
    }

    @Override
    public String desc() {
        return "装修公司提供，一级顶";
    }
}
