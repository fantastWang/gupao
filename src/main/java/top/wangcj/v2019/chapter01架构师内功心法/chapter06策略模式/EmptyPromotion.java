package top.wangcj.v2019.chapter01架构师内功心法.chapter06策略模式;

/**
 * @author wangchaojie
 * @description 暂无促销活动
 * @date 2019/8/24 17:52
 */
public class EmptyPromotion implements Promotion{
    @Override
    public void sales() {
        System.out.println("暂无优惠，敬请期待");
    }
}
