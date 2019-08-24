package top.wangcj.chapter06策略模式;

import java.util.HashMap;
import java.util.Map;

/**
 * 促销活动工厂：用于统一管理促销方式
 */
public class ActivityFactory {

    private ActivityFactory(){}

    private static Map<String,Object> map = new HashMap<>();

    static {
        map.put("CashBack",new CashBackPromotion());
        map.put("GroupBuy",new GroupBuyPromotion());
        map.put("Coupons",new CouponsPromotion());
    }

    public static Promotion getInstance(String type){
        Promotion promotion = (Promotion) map.get(type);
        return promotion == null?new EmptyPromotion():promotion;
    }
}
