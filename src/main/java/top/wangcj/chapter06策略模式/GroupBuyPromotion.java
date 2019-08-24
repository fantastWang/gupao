package top.wangcj.chapter06策略模式;

/**
 * @author wangchaojie
 * @description 团购促销
 * @date 2019/8/24 17:52
 */
public class GroupBuyPromotion implements Promotion {
    @Override
    public void sales() {
        System.out.println("团购促销啦~~~");
    }
}
