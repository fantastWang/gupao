package top.wangcj.v2019.chapter01架构师内功心法.chapter01工厂模式.factoryMethod;

/**
 * 工厂方法和简单工厂不一样
 * 工厂方法：不自己进行生产，只定义，将具体生产交由实现类工厂完成
 *
 * @author wangchaojie
 * @description
 * @date 2019/8/16 15:01
 */
public interface IFoodFatory {

    IFood createFood();
}
