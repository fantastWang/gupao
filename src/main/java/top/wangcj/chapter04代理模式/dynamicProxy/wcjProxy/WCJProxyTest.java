package top.wangcj.chapter04代理模式.dynamicProxy.wcjProxy;

/**
 * @author wangchaojie
 * @description 测试类
 * @date 2019/8/30 14:36
 */
public class WCJProxyTest {
    public static void main(String[] args) {
        Person person = (Person) new WCJHouseProxy().getInstance(new Customer());
        person.buyHouse();
    }
}
