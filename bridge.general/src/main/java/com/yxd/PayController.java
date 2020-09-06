package com.yxd;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.math.BigDecimal;

/**
 * @author yangxudong
 * @description:
 * @date 2020/9/6 18:08
 */
public class PayController {
    private Logger logger = LoggerFactory.getLogger(PayController.class);

    public boolean doPay(String uId, String tradeId, BigDecimal amount, int channelType, int modelType) {
        if (1 == channelType) {
            logger.info("模拟微信支付开始:userId:{}, tradeId:{}, amount:{}", uId, tradeId, amount);
            if (1 == modelType) {
                logger.info("密码支付");
            } else if (2 == modelType) {
                logger.info("人脸支付");
            } else if (3 == modelType) {
                logger.info("指纹支付");
            }
        } else if (2 == channelType) {
            logger.info("模拟支付宝支付开始:userId:{}, tradeId:{}, amount:{}", uId, tradeId, amount);
            if (1 == modelType) {
                logger.info("密码支付");
            } else if (2 == modelType) {
                logger.info("人脸支付");
            } else if (3 == modelType) {
                logger.info("指纹支付");
            }
        }
        return true;
    }
}
