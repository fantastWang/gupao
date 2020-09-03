package top.wangcj.v2020.chapter01架构师内功心法.chapter04原型模式与建造者模式详解.chapter01原型模式;

/**
 * @author wangchaojie
 * @Description TODO
 * @Date 2020/9/3 17:15
 **/
public class PrototypeTest {
    public static void main(String[] args) {
        Consumer consumer = new Consumer();
        consumer.setName("Java");
        System.out.println(consumer);
        //通过克隆产生新对象，并将值copy
        Consumer clone = consumer.clone();
        System.out.println(clone==consumer);
        System.out.println(clone.getName()==consumer.getName());
    }
}
