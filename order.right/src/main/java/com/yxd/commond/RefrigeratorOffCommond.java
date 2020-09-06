package com.yxd.commond;

import com.yxd.implementor.Refrigerator;

/**
 * @author yangxudong
 * @description:
 * @date 2020/9/5 8:03
 */
public class RefrigeratorOffCommond implements Commond {
    private Refrigerator refrigerator;

    public RefrigeratorOffCommond(Refrigerator refrigerator) {
        this.refrigerator = refrigerator;
    }

    @Override
    public void execute() {
        refrigerator.off();
    }

    @Override
    public void undo() {
        refrigerator.on();
    }
}
