package com.yxd.commond;

import com.yxd.implementor.Washer;

/**
 * @author yangxudong
 * @description:
 * @date 2020/9/5 8:03
 */
public class WasherOffCommond implements Commond {
    private Washer washer;

    public WasherOffCommond(Washer washer) {
        this.washer = washer;
    }

    @Override
    public void execute() {
        washer.off();
    }

    @Override
    public void undo() {
        washer.on();
    }
}
