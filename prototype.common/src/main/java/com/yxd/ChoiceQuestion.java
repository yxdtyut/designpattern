package com.yxd;

import java.util.Map;

/**
 * @author yangxudong
 * @description:
 * @date 2020/8/23 19:41
 */
public class ChoiceQuestion {
    private String name;
    private Map<String, String> option;
    private String key;

    public ChoiceQuestion(String name, Map<String, String> option, String key) {
        this.name = name;
        this.option = option;
        this.key = key;
    }

    public ChoiceQuestion() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Map<String, String> getOption() {
        return option;
    }

    public void setOption(Map<String, String> option) {
        this.option = option;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }
}
