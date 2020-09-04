package top.wangcj.v2020.chapter01架构师内功心法.chapter04原型模式与建造者模式详解.chapter01原型模式.chapter01通用写法;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wangchaojie
 * @Description TODO
 * @Date 2020/9/3 17:15
 **/
public class PrototypeTest {
    public static void main(String[] args) {
        Consumer consumer = new Consumer();
        List<String> list = new ArrayList<>();
        list.add("1");
        consumer.setName("Java");
        consumer.setList(list);
        //通过克隆产生新对象，并将值copy
        Consumer clone = consumer.clone();
        //当往克隆对象的list属性中添加值时，原对象的值也会随之添加
        clone.getList().add("2");
        System.out.println(consumer);
        System.out.println(clone);
        //判断对象是否为同一对象，属性值地址值是否一致
        System.out.println(clone == consumer);
        System.out.println(clone.getName() == consumer.getName());
        System.out.println(clone.getList() == consumer.getList());
    }
}