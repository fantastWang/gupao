package top.wangcj.v2019.chapter01架构师内功心法.chapter06策略模式;

/**
 * @author wangchaojie
 * @description 现金返现促销
 * @date 2019/8/24 17:52
 */
public class CashBackPromotion implements Promotion {
    @Override
    public void sales() {
        System.out.println("现金返现促销啦~~~");
    }
}
