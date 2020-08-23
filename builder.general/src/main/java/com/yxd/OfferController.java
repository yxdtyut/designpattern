package com.yxd;

import com.yxd.emulsion.BiMeite;
import com.yxd.emulsion.DashiQi;
import com.yxd.floor.Oumiga;
import com.yxd.floor.ShengXiang;
import com.yxd.suspended.OneLevelTop;
import com.yxd.suspended.TwoLevelTop;
import com.yxd.waterelectrictiry.ERA;
import com.yxd.waterelectrictiry.Lesso;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * @author yangxudong
 * @description:
 * @date 2020/8/23 16:10
 */
public class OfferController {
    /**
    * @description:
    * * @param area 面积
    * @param type 类型 1 新中式 2 简约 3 北欧
    * @returnType:java.lang.String
    * @author 22
    * @date 2020/8/23 16:12
    */
    public String offer(BigDecimal area, int type) {
        List<Material> materialList = new ArrayList<>();
        BigDecimal totalPrice = BigDecimal.ZERO;
        if (1 == type) {
            Material floor = new ShengXiang();
            Material emulsion = new DashiQi();
            Material oneLevel = new OneLevelTop();
            Material waterElec = new ERA();

            materialList.add(floor);
            materialList.add(emulsion);
            materialList.add(oneLevel);
            materialList.add(waterElec);

            totalPrice = addPrice(area, totalPrice, floor, emulsion, oneLevel, waterElec);
        } else if (2 == type) {
            Material floor = new Oumiga();
            Material emulsion = new DashiQi();
            Material oneLevel = new OneLevelTop();
            Material waterElec = new Lesso();

            materialList.add(floor);
            materialList.add(emulsion);
            materialList.add(oneLevel);
            materialList.add(waterElec);

            totalPrice = addPrice(area, totalPrice, floor, emulsion, oneLevel, waterElec);
        } else if (3 == type) {
            Material floor = new ShengXiang();
            Material emulsion = new BiMeite();
            Material oneLevel = new TwoLevelTop();
            Material waterElec = new ERA();

            materialList.add(floor);
            materialList.add(emulsion);
            materialList.add(oneLevel);
            materialList.add(waterElec);

            totalPrice = addPrice(area, totalPrice, floor, emulsion, oneLevel, waterElec);
        }

        StringBuilder sb = new StringBuilder("\r\n----------------------------------------------------\r\n"
        + "装修清单\r\n" + "套餐等级:" + type + "\r\n装修面积:" + area + "\r\n套餐总费用:" + totalPrice + "\r\n");
        materialList.stream().forEach(material -> {
            sb.append(material.purpose()).append(": 品牌-").append(material.brand()).append(", 单价-").append(material.price()).append(", 描述-")
                    .append(material.desc()).append("\r\n");
        });
        return sb.toString();
    }

    private BigDecimal addPrice(BigDecimal area, BigDecimal totalPrice, Material floor, Material emulsion, Material oneLevel, Material waterElec) {
        totalPrice = totalPrice.add(area.multiply(floor.price()));
        totalPrice = totalPrice.add(area.multiply(new BigDecimal(1.45)).multiply(emulsion.price()));
        totalPrice = totalPrice.add(area.multiply(oneLevel.price()));
        totalPrice = totalPrice.add(area.multiply(new BigDecimal(0.6)).multiply(waterElec.price()));
        return totalPrice;
    }
}
