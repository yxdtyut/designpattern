package com.yxd;


import org.junit.Test;

import java.math.BigDecimal;

public class PayControllerTest {
    @Test
    public void test() {
        PayController payController = new PayController();
        payController.doPay("111", "222", new BigDecimal(66.66), 2, 1);
    }
}
