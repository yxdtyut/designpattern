package com.yxd.receive;

import com.alibaba.fastjson.JSON;
import com.yxd.mq.POPOrderDelicverd;

/**
 * @author yangxudong
 * @description:
 * @date 2020/8/23 22:30
 */
public class POPOrderDeliveredService {
    public void onMessage(String message) {
        POPOrderDelicverd pop = JSON.parseObject(message, POPOrderDelicverd.class);
        pop.getDecimal();
        pop.getOrderId();
        pop.getOrderTime();
        // ...
    }
}
