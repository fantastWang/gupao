package top.wangcj.v2019.chapter01架构师内功心法.chapter01工厂模式.simpleFactory;

/**
 * @author wangchaojie
 * @description
 * @date 2019/8/16 14:49
 */
public class CarTest {

    public static void main(String[] args) {
        //使用汽车工厂生产汽车
        CarFactory carFactory = new CarFactory();
        carFactory.createCar("Benz").create();
    }
}
