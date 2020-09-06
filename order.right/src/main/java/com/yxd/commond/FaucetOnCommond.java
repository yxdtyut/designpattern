package com.yxd.commond;

import com.yxd.implementor.Faucet;
import com.yxd.implementor.Light;

/**
 * @author yangxudong
 * @description:
 * @date 2020/9/5 8:03
 */
public class FaucetOnCommond implements Commond {
    private Faucet faucet;

    public FaucetOnCommond(Faucet faucet) {
        this.faucet = faucet;
    }

    @Override
    public void execute() {
        faucet.on();
    }

    @Override
    public void undo() {
        faucet.off();
    }
}
