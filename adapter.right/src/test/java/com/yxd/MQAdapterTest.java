package com.yxd;

import com.alibaba.fastjson.JSON;
import com.yxd.mq.CreateAccount;
import com.yxd.mq.OrderMq;
import org.junit.Test;
import sun.util.resources.LocaleData;

import java.lang.reflect.InvocationTargetException;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Locale;

public class MQAdapterTest {
    @Test
    public void testMQAdapter() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        CreateAccount create_account = new CreateAccount();
        create_account.setNumber("100001");
        create_account.setAddress("河北省.廊坊市.广阳区.大学里职业技术学院");
        create_account.setAccountDate(LocalDate.now());
        create_account.setDesc("在校开户");

        HashMap<String, String> link01 = new HashMap<String, String>();
        link01.put("userId", "number");
        link01.put("bizId", "number");
        link01.put("bizTime", "accountDate");
        link01.put("desc", "desc");
        RebateInfo rebateInfo01 = MQAdapter.filter(JSON.toJSONString(create_account), link01);
        System.out.println("mq.create_account(适配前)" + create_account.toString());
        System.out.println("mq.create_account(适配后)" + rebateInfo01.toString());

        System.out.println("");

        OrderMq orderMq = new OrderMq();
        orderMq.setUid("100001");
        orderMq.setSku("10928092093111123");
        orderMq.setOrderId("100000890193847111");
        orderMq.setCreateOrderTime(LocalDate.now());

        HashMap<String, String> link02 = new HashMap<String, String>();
        link02.put("userId", "uid");
        link02.put("bizId", "orderId");
        link02.put("bizTime", "createOrderTime");
        RebateInfo rebateInfo02 = MQAdapter.filter(JSON.toJSONString(orderMq), link02);

        System.out.println("mq.orderMq(适配前)" + orderMq.toString());
        System.out.println("mq.orderMq(适配后)" + rebateInfo02.toString());
    }
}
