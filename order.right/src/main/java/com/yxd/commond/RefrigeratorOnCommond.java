package com.yxd.commond;

import com.yxd.implementor.Faucet;
import com.yxd.implementor.Refrigerator;

/**
 * @author yangxudong
 * @description:
 * @date 2020/9/5 8:03
 */
public class RefrigeratorOnCommond implements Commond {
    private Refrigerator refrigerator;

    public RefrigeratorOnCommond(Refrigerator refrigerator) {
        this.refrigerator = refrigerator;
    }

    @Override
    public void execute() {
        refrigerator.on();
    }

    @Override
    public void undo() {
        refrigerator.off();
    }
}
