package top.wangcj.v2019.chapter01架构师内功心法.chapter01工厂模式.simpleFactory;

/**
 * 汽车工厂生产汽车
 *
 * @author wangchaojie
 * @description
 * @date 2019/8/16 14:40
 */
public class CarFactory {

    /**
     * 根据不同的汽车名返回不同的汽车对象
     */
    public ICar createCar(String carName) {
        if ("Benz".equals(carName)) {
            return new BenzCar();
        }
        if ("Panamera".equals(carName)) {
            return new PanameraCar();
        }
        return null;
    }
}