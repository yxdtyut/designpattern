package com.yxd.service.adapter;

import com.yxd.service.OrderService;
import com.yxd.service.POPOrderService;

/**
 * @author yangxudong
 * @description:
 * @date 2020/8/23 23:07
 */
public class POPOrderAdapterService implements OrderAdapterService {
    private POPOrderService popOrderService = new POPOrderService();

    public boolean isFirst(String uid) {
        return popOrderService.isFirstOrder(uid);
    }
}
