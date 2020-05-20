package top.wangcj.chapter01架构师内功心法.chapter04代理模式.staticProxy.basics;

/**
 * @author wangchaojie
 * @description 厨师长，代理顾客，帮助实现其吃饭要求
 * @date 2019/8/22 17:38
 */
public class ChefProxy implements Person {

    private Customer person;

    public ChefProxy(Customer person) {
        this.person = person;
    }

    @Override
    public void eat() {
        System.out.println("开始制作。。。");
        this.person.eat();
        System.out.println("制作完成。。。");
    }
}
