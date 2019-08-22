package top.wangcj.chapter01工厂模式.abstractFactory;

/**
 * @author wangchaojie
 * @description
 * @date 2019/8/16 15:24
 */
public class AbstractHotelTest {

    public static void main(String[] args) {
        IHotelFactory hotelFactory = new BeijingHotelFactory();
        hotelFactory.rest();
        hotelFactory.cook();
        hotelFactory.bath();
    }
}
