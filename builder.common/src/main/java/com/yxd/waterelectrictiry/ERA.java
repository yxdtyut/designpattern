package com.yxd.waterelectrictiry;

import com.yxd.Material;

import java.math.BigDecimal;

/**
 * @author yangxudong
 * @description:
 * @date 2020/8/23 16:07
 */
public class ERA implements Material {
    @Override
    public String purpose() {
        return "水电管材";
    }

    @Override
    public String brand() {
        return "ERA";
    }

    @Override
    public BigDecimal price() {
        return new BigDecimal(14);
    }

    @Override
    public String desc() {
        return "ERA公元，一辈子舒心";
    }
}
