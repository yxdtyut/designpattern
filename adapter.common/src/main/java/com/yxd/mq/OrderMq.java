package com.yxd.mq;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Locale;

/**
 * @author yangxudong
 * @description:
 * @date 2020/8/23 22:17
 */
public class OrderMq {
   private String uid;
   private String sku;
   private String orderId;
   private LocalDate createOrderTime;

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public LocalDate getCreateOrderTime() {
        return createOrderTime;
    }

    public void setCreateOrderTime(LocalDate createOrderTime) {
        this.createOrderTime = createOrderTime;
    }

    @Override
    public String toString() {
        return "OrderMq{" +
                "uid='" + uid + '\'' +
                ", sku='" + sku + '\'' +
                ", orderId='" + orderId + '\'' +
                ", createOrderTime=" + createOrderTime +
                '}';
    }
}
