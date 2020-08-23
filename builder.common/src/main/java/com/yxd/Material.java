package com.yxd;

import java.math.BigDecimal;

/**
 * @author yangxudong
 * @description:
 * @date 2020/8/23 15:57
 */
public interface Material {
    String purpose();

    String brand();

    BigDecimal price();

    String desc();
}
