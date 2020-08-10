package com.yxd.entity;

import com.alibaba.fastjson.JSON;
import com.yxd.card.IQiYiCardService;
import com.yxd.coupon.CouponResult;
import com.yxd.coupon.CouponService;
import com.yxd.goods.DeliverReq;
import com.yxd.goods.GoodsService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author yangxudong
 * @description: 奖品服务 传统写法，简单粗暴但是一坨
 * @date 2020/8/10 22:51
 */
public class PrizeController {
    private Logger logger = LoggerFactory.getLogger(PrizeController.class);

    public AwardRes awardToUser(AwardReq req) {
        AwardRes awardRes = null;
        logger.info("奖品发放开始:{}, req: {}", req.getuId(), JSON.toJSONString(req));
        try {
            // 根据类型判断 调用不同的发放逻辑
            if (req.getAwardType() == 1) { // 发放优惠券
                CouponService couponService = new CouponService();
                CouponResult couponResult = couponService.sendCoupon(req.getuId(), req.getAwardNumber(), req.getBizId());
                if ("200100".equals(couponResult.getCode())) {
                    awardRes = new AwardRes("200100", "发放成功");
                } else {
                    awardRes = new AwardRes("300100", couponResult.getInfo());
                }
            } else if (req.getAwardType() == 2) { // 发放实际商品
                GoodsService goodsService = new GoodsService();
                DeliverReq deliverReq = new DeliverReq();
                deliverReq.setUserName(queryUserName(req.getuId()));
                deliverReq.setConsigneeUserPhone(queryUserPhone(req.getuId()));
                deliverReq.setSku(req.getAwardNumber());
                deliverReq.setOrderId(req.getBizId());
                deliverReq.setConsigneeUserName(req.getExtMap().get("consigneeUserName"));
                deliverReq.setConsigneeUserPhone(req.getExtMap().get("consigneeUserPhone"));
                deliverReq.setConsigneeUserAddress(req.getExtMap().get("consigneeUserAddress"));
                Boolean isSuccess = goodsService.deliverGoods(deliverReq);
                if (isSuccess) {
                    awardRes = new AwardRes("200100", "发放成功");
                } else {
                    awardRes = new AwardRes("300100", "发放失败");
                }
            } else if (req.getAwardType() == 3) {
                String mobileNumnber = queryUserPhone(req.getuId());
                IQiYiCardService iQiYiCardService = new IQiYiCardService();
                iQiYiCardService.grantToken(mobileNumnber, req.getAwardNumber());
                awardRes = new AwardRes("200100", "发放成功");
            }
            logger.info("奖品发放完成:{}", req.getuId());
        } catch (Exception e) {
            logger.error("奖品发放失败:{}, req:{}", req.getuId(), JSON.toJSONString(req));
            awardRes = new AwardRes("300100", "发放失败");
        }
        return awardRes;
    }

    private String queryUserPhone(String s) {
        return "666";
    }

    private String queryUserName(String s) {
        return "老疙瘩";
    }
}
