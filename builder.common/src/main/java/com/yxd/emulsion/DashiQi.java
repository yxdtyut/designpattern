package com.yxd.emulsion;

import com.yxd.Material;

import java.math.BigDecimal;

/**
 * @author yangxudong
 * @description:
 * @date 2020/8/23 16:02
 */
public class DashiQi implements Material {
    @Override
    public String purpose() {
        return "乳胶漆";
    }

    @Override
    public String brand() {
        return "大师漆";
    }

    @Override
    public BigDecimal price() {
        return new BigDecimal(33);
    }

    @Override
    public String desc() {
        return "正真的大师永远怀着一颗学徒的心";
    }
}
