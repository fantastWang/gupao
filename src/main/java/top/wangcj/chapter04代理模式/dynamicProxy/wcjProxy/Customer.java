package top.wangcj.chapter04代理模式.dynamicProxy.wcjProxy;

/**
 * @author wangchaojie
 * @description 买房顾客
 * @date 2019/8/30 10:58
 */
public class Customer implements Person {
    @Override
    public void buyHouse() {
        System.out.println("140平，南北通透，有学区，好停车，设施齐全，交通便利");
    }
}
