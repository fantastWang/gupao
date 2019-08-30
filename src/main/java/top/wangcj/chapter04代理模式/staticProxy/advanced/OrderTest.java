package top.wangcj.chapter04代理模式.staticProxy.advanced;

/**
 * @author wangchaojie
 * @description
 * @date 2019/8/29 11:26
 */
public class OrderTest {
    public static void main(String[] args) {
        Order order = new Order();
        order.setDate("2019");
        OrderServiceImpl orderService = new OrderServiceImpl();
        new DataSourceSwitchProxy(orderService).add(order);
    }
}
