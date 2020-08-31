package top.wangcj.v2019.chapter01架构师内功心法.chapter04代理模式.staticProxy.basics;

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
        proxy.eat();
    }
}
