package top.wangcj.chapter06策略模式;

/**
 * @author wangchaojie
 * @description 活动测试
 * @date 2019/8/24 17:55
 */
public class ActivityTest {
    public static void main(String[] args) {
        //现金促销
        new Activity().doActivity(new CashBackPromotion());
        //团购促销
        new Activity().doActivity(new GroupBuyPromotion());
        //优惠券促销
        new Activity().doActivity(new CouponsPromotion());
    }
}
