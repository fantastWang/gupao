package top.wangcj.chapter06策略模式;

/**
 * @author wangchaojie
 * @description 活动测试，模拟客户使用不同的方式进行促销
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
        /**
         * 第二种方式进行促销，属于比较常见的一种
         */
        String type = "CashBack";
        if("CashBack".equals(type)){
            new Activity().doActivity(new CashBackPromotion());
        }else if("GroupBuy".equals(type)){
            new Activity().doActivity(new GroupBuyPromotion());
        }else if("Coupons".equals(type)){
            new Activity().doActivity(new CouponsPromotion());
        }//.......
        /**
         * 促销工厂管理
         */
        Promotion promotion = ActivityFactory.getInstance(type);
        promotion.sales();
    }
}
