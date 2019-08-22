package top.wangcj.chapter01工厂模式.factoryMethod;

/**
 * 烤鸭生产工厂
 *
 * @author wangchaojie
 * @description
 * @date 2019/8/16 15:05
 */
public class RoastDuckFactory implements IFoodFatory {
    @Override
    public IFood createFood() {
        return new RoastDuck();
    }
}
