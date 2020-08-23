package com.yxd.service.adapter;

import com.yxd.service.OrderService;

/**
 * @author yangxudong
 * @description:
 * @date 2020/8/23 23:06
 */
public class InsideOrderService implements OrderAdapterService {

    private OrderService orderService = new OrderService();

    @Override
    public boolean isFirst(String uid) {
        return orderService.queryUserOrderCount(uid) <=1;
    }
}
