package top.wangcj.v2019.chapter01架构师内功心法.chapter01工厂模式.abstractFactory;

/**
 * @author wangchaojie
 * @description
 * @date 2019/8/16 15:18
 */
public class BeijingHotelFactory implements IHotelFactory {
    @Override
    public IRest rest() {
        return new BeijingRest();
    }

    @Override
    public ICook cook() {
        return new BeijingCook();
    }

    @Override
    public IBath bath() {
        return new BeijingBath();
    }
}