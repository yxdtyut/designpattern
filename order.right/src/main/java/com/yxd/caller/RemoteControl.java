package com.yxd.caller;

import com.yxd.commond.Commond;
import com.yxd.commond.NoCommond;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yangxudong
 * @description:
 * @date 2020/9/5 8:12
 */
public class RemoteControl {
    private List<Commond> turnOnList;
    private List<Commond> turnOffList;

    private Commond lastCommond;

    public RemoteControl() {
        turnOnList = new ArrayList<>(4);
        turnOffList = new ArrayList<>(4);
        lastCommond = new NoCommond();
        for (int i = 1; i <= 4; i++) {
            turnOnList.add(new NoCommond());
            turnOffList.add(new NoCommond());
        }
    }

    public void addCommon(int position, Commond commond, int type) {
        if (type == 1) {
            turnOnList.set(position - 1, commond);
        } else if (type == 0) {
            turnOffList.set(position - 1, commond);
        }
    }

    public void turnOn(int position) {
        turnOnList.get(position - 1).execute();
        lastCommond = turnOnList.get(position - 1);
    }

    public void turnOff(int position) {
        turnOffList.get(position - 1).execute();
        lastCommond = turnOffList.get(position - 1);
    }

    public void undo() {
        lastCommond.undo();
    }

    public void display(){
        System.out.println("=====遥控器=====");
        for (int i = 0; i < turnOffList.size(); i++) {
            System.out.println("第" + (i+1) +"排开关,打开功能:" + turnOnList.get(i).getClass() + "，关闭功能:" + turnOffList.get(i).getClass());
        }
    }
}
