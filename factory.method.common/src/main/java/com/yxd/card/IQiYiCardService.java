package com.yxd.card;

/**
 * @author yangxudong
 * @description: 爱奇艺会员卡服务
 * @date 2020/8/10 22:22
 */
public class IQiYiCardService {
    public void grantToken(String bindMobileNumber, String cardId) {
        System.out.println("模拟发放一张爱奇艺会员卡:" + bindMobileNumber + "," + cardId);
    }
}
