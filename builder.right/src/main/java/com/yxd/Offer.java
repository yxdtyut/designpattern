package com.yxd;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * @author yangxudong
 * @description:
 * @date 2020/8/23 16:46
 */
public class Offer {
    private List<Material> materialList = new ArrayList<>();
    private BigDecimal totalPrice = BigDecimal.ZERO;

    private BigDecimal area;
    private Integer type;

    public Offer(Double area, Integer type) {
        this.area = new BigDecimal(area);
        this.type = type;
    }

    public Offer addFloor(Material material) {
        materialList.add(material);
        this.totalPrice = totalPrice.add(area.multiply(material.price()));
        return this;
    }

    public Offer addEmulsion(Material material) {
        materialList.add(material);
        this.totalPrice = totalPrice.add(area.multiply(new BigDecimal(1.45)).multiply(material.price()));
        return this;
    }

    public Offer addSuspended(Material material) {
        materialList.add(material);
        this.totalPrice = totalPrice.add(area.multiply(material.price()));
        return this;
    }

    public Offer addWaterelectricity(Material material) {
        materialList.add(material);
        this.totalPrice = totalPrice.add(area.multiply(new BigDecimal(0.6)).multiply(material.price()));
        return this;
    }

    public String display() {
        StringBuilder sb = new StringBuilder("\r\n----------------------------------------------------\r\n"
                + "装修清单\r\n" + "套餐等级:" + type + "\r\n装修面积:" + area + "\r\n套餐总费用:" + totalPrice + "\r\n");
        materialList.stream().forEach(material -> {
            sb.append(material.purpose()).append(": 品牌-").append(material.brand()).append(", 单价-").append(material.price()).append(", 描述-")
                    .append(material.desc()).append("\r\n");
        });
        return sb.toString();
    }
}
