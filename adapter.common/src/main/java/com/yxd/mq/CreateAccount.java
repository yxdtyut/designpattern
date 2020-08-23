package com.yxd.mq;

import java.time.LocalDate;
import java.util.Locale;

/**
 * @author yangxudong
 * @description:
 * @date 2020/8/23 22:16
 */
public class CreateAccount {
    private String number; //开户编号
    private String address;
    private LocalDate accountDate; //开户时间
    private String desc;

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public LocalDate getAccountDate() {
        return accountDate;
    }

    public void setAccountDate(LocalDate accountDate) {
        this.accountDate = accountDate;
    }

    @Override
    public String toString() {
        return "CreateAccount{" +
                "number='" + number + '\'' +
                ", address='" + address + '\'' +
                ", accountDate=" + accountDate +
                ", desc='" + desc + '\'' +
                '}';
    }
}
