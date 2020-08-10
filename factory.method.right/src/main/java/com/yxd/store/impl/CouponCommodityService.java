package com.yxd.store.impl;

import com.alibaba.fastjson.JSON;
import com.yxd.coupon.CouponResult;
import com.yxd.coupon.CouponService;
import com.yxd.store.ICommodity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;

/**
 * @author yangxudong
 * @description:
 * @date 2020/8/10 23:19
 */
public class CouponCommodityService implements ICommodity {
    private Logger logger = LoggerFactory.getLogger(CouponCommodityService.class);

    private CouponService couponService = new CouponService();

    @Override
    public void sendCommodity(String uId, String commodityId, String bizId, Map<String, String> extMap) throws Exception {
        CouponResult couponResult = couponService.sendCoupon(uId, commodityId, bizId);
        logger.info("请求参数[优惠券] => uId：{} commodityId：{} bizId：{} extMap：{}", uId, commodityId, bizId, JSON.toJSON(extMap));
        logger.info("测试结果[优惠券]：{}", JSON.toJSON(couponResult));
        if (!"200100".equals(couponResult.getCode())) throw new RuntimeException(couponResult.getInfo());
    }
}
