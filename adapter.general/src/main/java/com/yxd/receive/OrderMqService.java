package com.yxd.receive;

import com.alibaba.fastjson.JSON;
import com.yxd.mq.OrderMq;

/**
 * @author yangxudong
 * @description:
 * @date 2020/8/23 22:29
 */
public class OrderMqService {
    public void onMessage(String message) {
        OrderMq orderMq = JSON.parseObject(message, OrderMq.class);
        orderMq.getCreateOrderTime();
        orderMq.getSku();
        orderMq.getUid();
        // ...
    }
}
