package com.yxd.floor;

import com.yxd.Material;

import java.math.BigDecimal;

/**
 * @author yangxudong
 * @description:
 * @date 2020/8/23 16:00
 */
public class Oumiga implements Material {
    @Override
    public String purpose() {
        return "地板";
    }

    @Override
    public String brand() {
        return "欧米茄";
    }

    @Override
    public BigDecimal price() {
        return new BigDecimal(77);
    }

    @Override
    public String desc() {
        return "欧米茄地板，生活不再单调";
    }
}
