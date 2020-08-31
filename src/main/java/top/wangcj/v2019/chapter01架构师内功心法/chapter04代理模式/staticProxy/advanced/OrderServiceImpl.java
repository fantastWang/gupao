package top.wangcj.v2019.chapter01架构师内功心法.chapter04代理模式.staticProxy.advanced;

/**
 * @author wangchaojie
 * @description
 * @date 2019/8/29 11:10
 */
public class OrderServiceImpl implements IOrderService {

    private OrderDao orderDao;

    public OrderServiceImpl() {
        this.orderDao = new OrderDao();
    }

    @Override
    public void add(Order order) {
        orderDao.add(order);
    }
}
