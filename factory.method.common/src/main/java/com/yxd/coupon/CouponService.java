package com.yxd.coupon;

/**
 * @author yangxudong
 * @description: 发放优惠卷处理
 * @date 2020/8/10 22:26
 */
public class CouponService {
    public CouponResult sendCoupon(String uid, String couponNumber, String uuid) {
        System.out.println("模拟发放优惠卷一张:" + uid + "," + couponNumber + "," + uuid);
        return new CouponResult("200100", "发放成功");
    }
}
