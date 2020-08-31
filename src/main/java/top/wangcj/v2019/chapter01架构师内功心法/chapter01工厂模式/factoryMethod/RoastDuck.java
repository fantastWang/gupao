package top.wangcj.v2019.chapter01架构师内功心法.chapter01工厂模式.factoryMethod;

/**
 * 烤鸭对象
 *
 * @author wangchaojie
 * @description
 * @date 2019/8/16 15:08
 */
public class RoastDuck implements IFood {
    @Override
    public void create() {
        System.out.println("生产了一只烤鸭");
    }
}
