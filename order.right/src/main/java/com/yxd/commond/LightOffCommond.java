package com.yxd.commond;

import com.yxd.implementor.Light;

/**
 * @author yangxudong
 * @description:
 * @date 2020/9/5 8:03
 */
public class LightOffCommond implements Commond {
    private Light light;

    public LightOffCommond(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }

    @Override
    public void undo() {
        light.on();
    }
}
