package com.yxd.commond;

import com.yxd.implementor.Light;
import com.yxd.implementor.Washer;

/**
 * @author yangxudong
 * @description:
 * @date 2020/9/5 8:03
 */
public class WasherOnCommond implements Commond {
    private Washer washer;

    public WasherOnCommond(Washer washer) {
        this.washer = washer;
    }

    @Override
    public void execute() {
        washer.on();
    }

    @Override
    public void undo() {
        washer.off();
    }
}
