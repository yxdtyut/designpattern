package bridge;

/**
 * @author yangxudong
 * @description:
 * @date 2020/9/6 18:22
 */
public class FaceModel implements ModelType {
    @Override
    public void doPay() {
        System.out.println("人脸支付");
    }
}
