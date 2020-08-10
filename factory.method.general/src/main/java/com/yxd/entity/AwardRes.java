package com.yxd.entity;

/**
 * @author yangxudong
 * @description: 请求响应
 * @date 2020/8/10 22:50
 */
public class AwardRes {
    private String code;
    private String info;

    public AwardRes(String code, String info) {
        this.code = code;
        this.info = info;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
