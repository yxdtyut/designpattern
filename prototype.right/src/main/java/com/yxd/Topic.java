package com.yxd;

import java.util.Map;

/**
 * @author yangxudong
 * @description:
 * @date 2020/8/23 20:18
 */
public class Topic {
    private Map<String, String> map;
    private String key;

    public Topic(Map<String, String> map, String key) {
        this.map = map;
        this.key = key;
    }

    public Map<String, String> getMap() {
        return map;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }
}
