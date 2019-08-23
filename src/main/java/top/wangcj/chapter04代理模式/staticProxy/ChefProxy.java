package top.wangcj.chapter04代理模式.staticProxy;

/**
 * @author wangchaojie
 * @description 厨师长，实现顾客的吃饭要求
 * @date 2019/8/22 17:38
 */
public class ChefProxy {

    private Person person;

    public ChefProxy(Person person) {
        this.person = person;
    }

    public void cook() {
        System.out.println("开始制作。。。");
        this.person.eat();
        System.out.println("制作完成。。。");
    }

}
