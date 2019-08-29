package top.wangcj.chapter04代理模式.staticProxy.advanced;

/**
 * @author wangchaojie
 * @description 数据源切换代理
 * @date 2019/8/29 11:16
 */
public class DataSourceSwitchProxy implements IOrderService {

    /**
     * 持有代理对象的引用
     **/
    private IOrderService orderService;

    public DataSourceSwitchProxy(IOrderService orderService) {
        this.orderService = orderService;
    }

    @Override
    public void add(Order order) {
        String date = order.getDate();
        DataSourceSwitch.set(date);
        //调用代理类的方法
        this.orderService.add(order);
    }
}
