package com.yxd.coupon;

/**
 * @author yangxudong
 * @description: 发放优惠卷返回结果
 * @date 2020/8/10 22:24
 */
public class CouponResult {
    private String code;
    private String info;

    public CouponResult(String code, String info) {
        this.code = code;
        this.info = info;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
