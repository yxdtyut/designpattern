package com.yxd;

import com.alibaba.fastjson.JSON;

import java.lang.reflect.InvocationTargetException;
import java.util.Map;

/**
 * @author yangxudong
 * @description:
 * @date 2020/8/23 22:37
 */
public class MQAdapter {
    public static RebateInfo filter(String strJson, Map<String, String> link) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        return filter(JSON.parseObject(strJson, Map.class), link);
    }

    public static RebateInfo filter(Map obj, Map<String, String> link) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        RebateInfo info = new RebateInfo();
        for (String nowKey : link.keySet()) {
            Object val = obj.get(link.get(nowKey));
            RebateInfo.class.getMethod("set" + nowKey.substring(0, 1).toUpperCase() + nowKey.substring(1), String.class).invoke(info, val);
        }
        return info;
    }
}
