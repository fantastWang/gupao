package top.wangcj.chapter01架构师内功心法.chapter01工厂模式.factoryMethod;

/**
 * 面包生产工厂
 *
 * @author wangchaojie
 * @description
 * @date 2019/8/16 15:05
 */
public class BreadFactory implements IFoodFatory {
    @Override
    public IFood createFood() {
        return new Bread();
    }
}
