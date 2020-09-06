package bridge;

import com.yxd.entity.PayInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author yangxudong
 * @description:
 * @date 2020/9/6 18:33
 */
public class WechatPay extends IChannel {

    Logger logger = LoggerFactory.getLogger(WechatPay.class);

    public WechatPay(ModelType modelType) {
        super(modelType);
    }

    @Override
    public void doPay(PayInfo payInfo) {
        logger.info("使用微信支付, uid:{}, tradeId:{}, amount:{}", payInfo.getuId(), payInfo.getTradeId(), payInfo.getAmount());
        modelType.doPay();
    }
}
