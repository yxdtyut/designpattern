package com.yxd;

import com.yxd.emulsion.BiMeite;
import com.yxd.emulsion.DashiQi;
import com.yxd.floor.Oumiga;
import com.yxd.floor.ShengXiang;
import com.yxd.suspended.OneLevelTop;
import com.yxd.suspended.TwoLevelTop;
import com.yxd.waterelectrictiry.ERA;
import com.yxd.waterelectrictiry.Lesso;

/**
 * @author yangxudong
 * @description:
 * @date 2020/8/23 16:55
 */
public class Builder {
    public Offer chinaOffer(Double area) {
        Offer offer = new Offer(area, 1);
        offer.addFloor(new ShengXiang()).addEmulsion(new DashiQi()).addWaterelectricity(new ERA()).addSuspended(new OneLevelTop());
        return offer;
    }

    public Offer simpleOffer(Double area) {
        Offer offer = new Offer(area, 1);
        offer.addFloor(new Oumiga()).addEmulsion(new DashiQi()).addWaterelectricity(new Lesso()).addSuspended(new OneLevelTop());
        return offer;
    }

    public Offer northEuropeOffer(Double area) {
        Offer offer = new Offer(area, 1);
        offer.addFloor(new ShengXiang()).addEmulsion(new BiMeite()).addWaterelectricity(new ERA()).addSuspended(new TwoLevelTop());
        return offer;
    }
}
