package com.yxd.mq;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Locale;

/**
 * @author yangxudong
 * @description:
 * @date 2020/8/23 22:20
 */
public class POPOrderDelicverd {
    private String uId;
    private String orderId;
    private LocalDate orderTime;
    private String sku;
    private String skuName;
    private BigDecimal decimal;

    public String getuId() {
        return uId;
    }

    public void setuId(String uId) {
        this.uId = uId;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public String getSkuName() {
        return skuName;
    }

    public void setSkuName(String skuName) {
        this.skuName = skuName;
    }

    public BigDecimal getDecimal() {
        return decimal;
    }

    public void setDecimal(BigDecimal decimal) {
        this.decimal = decimal;
    }

    public LocalDate getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(LocalDate orderTime) {
        this.orderTime = orderTime;
    }

    @Override
    public String toString() {
        return "POPOrderDelicverd{" +
                "uId='" + uId + '\'' +
                ", orderId='" + orderId + '\'' +
                ", orderTime=" + orderTime +
                ", sku='" + sku + '\'' +
                ", skuName='" + skuName + '\'' +
                ", decimal=" + decimal +
                '}';
    }
}
