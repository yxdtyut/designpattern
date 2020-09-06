package bridge;

import com.yxd.entity.PayInfo;

/**
 * @author yangxudong
 * @description:
 * @date 2020/9/6 18:17
 */
public abstract class IChannel {
    protected ModelType modelType;

    public IChannel(ModelType modelType) {
        this.modelType = modelType;
    }

    public abstract void doPay(PayInfo payInfo);
}
