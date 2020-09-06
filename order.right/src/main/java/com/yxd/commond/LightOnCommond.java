package com.yxd.commond;

import com.yxd.implementor.Light;

/**
 * @author yangxudong
 * @description:
 * @date 2020/9/5 8:03
 */
public class LightOnCommond implements Commond {
    private Light light;

    public LightOnCommond(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }

    @Override
    public void undo() {
        light.off();
    }
}
