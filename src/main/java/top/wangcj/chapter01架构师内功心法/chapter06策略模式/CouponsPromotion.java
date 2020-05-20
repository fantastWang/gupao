package top.wangcj.chapter01架构师内功心法.chapter06策略模式;

/**
 * @author wangchaojie
 * @description 优惠券促销
 * @date 2019/8/24 17:54
 */
public class CouponsPromotion implements Promotion {
    @Override
    public void sales() {
        System.out.println("优惠券促销啦");
    }
}
