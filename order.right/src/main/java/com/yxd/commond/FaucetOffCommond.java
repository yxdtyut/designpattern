package com.yxd.commond;

import com.yxd.implementor.Faucet;

/**
 * @author yangxudong
 * @description:
 * @date 2020/9/5 8:03
 */
public class FaucetOffCommond implements Commond {
    private Faucet faucet;

    public FaucetOffCommond(Faucet faucet) {
        this.faucet = faucet;
    }

    @Override
    public void execute() {
        faucet.off();
    }

    @Override
    public void undo() {
        faucet.on();
    }
}
