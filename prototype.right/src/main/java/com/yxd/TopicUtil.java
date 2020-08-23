package com.yxd;

import java.util.*;

/**
 * @author yangxudong
 * @description:
 * @date 2020/8/23 20:18
 */
public class TopicUtil {
    /**
    * @description:
    * * @param option 选项
    * @param key 正真的答案
    * @returnType:com.yxd.Topic
    * @author 22
    * @date 2020/8/23 20:22
    */
    public static Topic randomTopic(Map<String, String> option, String key) {
        Set<String> keySet = option.keySet();
        ArrayList<String> keyList = new ArrayList<>(keySet);
        Collections.shuffle(keyList);
        Map<String, String> newOption = new HashMap<>();
        int i = 0;
        String newKey = null;
        for (String oldKey : keySet) {
            String randomKey = keyList.get(i++);
            if (oldKey.equals(key)) {
                newKey = randomKey;
            }
            newOption.put(randomKey, option.get(oldKey));
        }
        return new Topic(newOption, newKey);
    }
}
