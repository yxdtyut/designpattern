package bridge;

/**
 * @author yangxudong
 * @description:
 * @date 2020/9/6 18:23
 */
public class FingerPrintModel implements ModelType {
    @Override
    public void doPay() {
        System.out.println("人脸支付");
    }
}
