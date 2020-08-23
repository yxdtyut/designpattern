package com.yxd.floor;

import com.yxd.Material;

import java.math.BigDecimal;

/**
 * @author yangxudong
 * @description:
 * @date 2020/8/23 15:59
 */
public class ShengXiang implements Material {
    @Override
    public String purpose() {
        return "地板";
    }

    @Override
    public String brand() {
        return "圣象";
    }

    @Override
    public BigDecimal price() {
        return new BigDecimal(80);
    }

    @Override
    public String desc() {
        return "圣象地板，国际 一流品牌";
    }
}
