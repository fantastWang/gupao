package top.wangcj.v2019.chapter01架构师内功心法.chapter06策略模式;

/**
 * @author wangchaojie
 * @description 大型售卖活动
 * @date 2019/8/24 15:39
 */
public class Activity {

    public void doActivity(Promotion promotion) {
        promotion.sales();
    }
}