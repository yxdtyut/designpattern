package com.yxd;

import static org.junit.Assert.assertTrue;

import bridge.*;
import com.yxd.entity.PayInfo;
import org.junit.Test;

import java.math.BigDecimal;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue(){
        IChannel channel = new WechatPay(new PwdModel());
        channel.doPay(new PayInfo("111", "222", new BigDecimal(66.66)));
    }
}
