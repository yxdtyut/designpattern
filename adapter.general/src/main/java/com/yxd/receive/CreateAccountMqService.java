package com.yxd.receive;

import com.alibaba.fastjson.JSON;
import com.yxd.mq.CreateAccount;

/**
 * @author yangxudong
 * @description:
 * @date 2020/8/23 22:28
 */
public class CreateAccountMqService {
    public void onMessage(String message) {
        CreateAccount createAccount = JSON.parseObject(message, CreateAccount.class);
        createAccount.getNumber();
        createAccount.getAddress();
        // ...
    }
}
