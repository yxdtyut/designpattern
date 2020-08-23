package com.yxd.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * @author yangxudong
 * @description:
 * @date 2020/8/23 22:22
 */
public class OrderService {
    private Logger logger = LoggerFactory.getLogger(OrderService.class);

    public long queryUserOrderCount(String userId) {
        logger.info("自营商家，查询用户订单数量:{}", userId);
        return 10L;
    }
}
