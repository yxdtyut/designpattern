package com.yxd;

import org.junit.Test;

public class BuilderTest {
    @Test
    public void testRemovation() {
        Builder builder = new Builder();
        Offer offer = builder.northEuropeOffer(112.75);
        System.out.println(offer.display());
    }
}
