package com.yxd.emulsion;

import com.yxd.Material;

import java.math.BigDecimal;

/**
 * @author yangxudong
 * @description:
 * @date 2020/8/23 16:01
 */
public class BiMeite implements Material {
    @Override
    public String purpose() {
        return "乳胶漆";
    }

    @Override
    public String brand() {
        return "比美特";
    }

    @Override
    public BigDecimal price() {
        return new BigDecimal(30);
    }

    @Override
    public String desc() {
        return "比美特乳胶漆，用着放心";
    }
}
