package top.wangcj.v2019.chapter01架构师内功心法.chapter01工厂模式.abstractFactory;

/**
 * @author wangchaojie
 * @description
 * @date 2019/8/16 15:14
 */
public interface IHotelFactory {

    IRest rest();

    ICook cook();

    IBath bath();
}