package com.yxd;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * @author yangxudong
 * @description:
 * @date 2020/8/23 22:36
 */
public class RebateInfo {
    private String userId;
    private String bizId;
    private LocalDate bizTime;
    private String desc;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getBizId() {
        return bizId;
    }

    public void setBizId(String bizId) {
        this.bizId = bizId;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public void setBizTime(String time) {
        this.bizTime = LocalDate.now();
    }

    @Override
    public String toString() {
        return "RebateInfo{" +
                "userId='" + userId + '\'' +
                ", bizId='" + bizId + '\'' +
                ", bizTime=" + bizTime +
                ", desc='" + desc + '\'' +
                '}';
    }
}
