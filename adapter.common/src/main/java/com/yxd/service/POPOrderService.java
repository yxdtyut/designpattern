package com.yxd.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author yangxudong
 * @description:
 * @date 2020/8/23 22:23
 */
public class POPOrderService {
    private Logger logger = LoggerFactory.getLogger(POPOrderService.class);

    public boolean isFirstOrder(String uId) {
        logger.info("POP商家，查询用户是否为首单:{}", uId);
        return true;
    }
}
