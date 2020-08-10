package com.yxd.goods;

import com.alibaba.fastjson.JSON;

/**
 * @author yangxudong
 * @description: 商品服务
 * @date 2020/8/10 22:30
 */
public class GoodsService {
    public Boolean deliverGoods(DeliverReq req) {
        System.out.println("模拟发放实物商品一个:" + JSON.toJSONString(req));
        return true;
    }
}
