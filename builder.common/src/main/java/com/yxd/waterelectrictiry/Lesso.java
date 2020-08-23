package com.yxd.waterelectrictiry;

import com.yxd.Material;

import java.math.BigDecimal;

/**
 * @author yangxudong
 * @description:
 * @date 2020/8/23 16:06
 */
public class Lesso implements Material {
    @Override
    public String purpose() {
        return "水电管材";
    }

    @Override
    public String brand() {
        return "LESSO";
    }

    @Override
    public BigDecimal price() {
        return new BigDecimal(16);
    }

    @Override
    public String desc() {
        return "LESSO联盟，质保80年";
    }
}
