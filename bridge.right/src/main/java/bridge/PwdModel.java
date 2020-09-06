package bridge;

/**
 * @author yangxudong
 * @description:
 * @date 2020/9/6 18:21
 */
public class PwdModel implements ModelType {
    @Override
    public void doPay() {
        System.out.println("密码支付");
    }
}
