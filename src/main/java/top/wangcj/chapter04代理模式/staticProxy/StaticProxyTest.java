package top.wangcj.chapter04代理模式.staticProxy;

/**
 * 静态代理测试类
 *
 * @author wangchaojie
 * @description
 * @date 2019/8/22 17:43
 */
public class StaticProxyTest {
    public static void main(String[] args) {
        ChefProxy proxy = new ChefProxy(new Customer());
        proxy.cook();
    }
}
