package com.yxd.store;

import java.util.Map;

/**
 * @author yangxudong
 * @description:
 * @date 2020/8/10 23:17
 */
public interface ICommodity {
    void sendCommodity(String uId, String commodityId, String bizId, Map<String, String> extMap) throws Exception;
}
