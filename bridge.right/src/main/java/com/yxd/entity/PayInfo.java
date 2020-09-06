package com.yxd.entity;

import java.math.BigDecimal;

/**
 * @author yangxudong
 * @description:
 * @date 2020/9/6 18:15
 */
public class PayInfo {
    private String uId;
    private String tradeId;
    private BigDecimal amount;

    public PayInfo(String uId, String tradeId, BigDecimal amount) {
        this.uId = uId;
        this.tradeId = tradeId;
        this.amount = amount;
    }

    public String getuId() {
        return uId;
    }

    public void setuId(String uId) {
        this.uId = uId;
    }

    public String getTradeId() {
        return tradeId;
    }

    public void setTradeId(String tradeId) {
        this.tradeId = tradeId;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }
}
