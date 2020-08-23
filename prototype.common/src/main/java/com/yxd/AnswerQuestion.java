package com.yxd;

/**
 * @author yangxudong
 * @description:
 * @date 2020/8/23 19:43
 */
public class AnswerQuestion {
    private String name;
    private String key;

    public AnswerQuestion(String name, String key) {
        this.name = name;
        this.key = key;
    }

    public AnswerQuestion() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }
}
