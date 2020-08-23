package com.yxd;

import static org.junit.Assert.assertTrue;

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
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    @Test
    public void testRemovation() {
        OfferController offer = new OfferController();
        String meal = offer.offer(new BigDecimal(112.75), 3);
        System.out.println(meal);
    }
}
