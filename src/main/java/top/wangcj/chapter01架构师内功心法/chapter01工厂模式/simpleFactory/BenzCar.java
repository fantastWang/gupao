package top.wangcj.chapter01架构师内功心法.chapter01工厂模式.simpleFactory;

/**
 * 奔驰汽车对象
 *
 * @author wangchaojie
 * @description
 * @date 2019/8/16 14:41
 */
public class BenzCar implements ICar{

    @Override
    public void create() {
        System.out.println("已经生产了一辆奔驰汽车");
    }
}
