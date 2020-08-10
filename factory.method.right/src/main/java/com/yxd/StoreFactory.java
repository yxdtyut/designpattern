package com.yxd;

import com.yxd.store.ICommodity;
import com.yxd.store.impl.CardCommodityService;
import com.yxd.store.impl.CouponCommodityService;
import com.yxd.store.impl.GoodsCommodityService;

/**
 * @author yangxudong
 * @description:
 * @date 2020/8/10 23:16
 */
public class StoreFactory {
    public ICommodity getCommodityService(Integer commodityType) {
        if (null == commodityType) return null;
        if (1 == commodityType) return new CouponCommodityService();
        if (2 == commodityType) return new GoodsCommodityService();
        if (3 == commodityType) return new CardCommodityService();
        throw new RuntimeException("不存在的商品服务类型");
    }
}
