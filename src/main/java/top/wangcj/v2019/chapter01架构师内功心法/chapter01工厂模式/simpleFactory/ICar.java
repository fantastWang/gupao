package top.wangcj.v2019.chapter01架构师内功心法.chapter01工厂模式.simpleFactory;

/**
 * 汽车接口定义
 * 简单工厂：根据传参，生产对应对象
 *
 * @author wangchaojie
 * @description
 * @date 2019/8/16 14:35
 */
public interface ICar {

    /**
     * 用于创建汽车
     */
    void create();
}