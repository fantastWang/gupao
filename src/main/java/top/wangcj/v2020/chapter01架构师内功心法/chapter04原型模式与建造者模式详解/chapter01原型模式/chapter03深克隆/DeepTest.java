package top.wangcj.v2020.chapter01架构师内功心法.chapter04原型模式与建造者模式详解.chapter01原型模式.chapter03深克隆;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wangchaojie
 * @Description TODO
 * @Date 2020/9/4 11:12
 **/
public class DeepTest {
    public static void main(String[] args) {
        SingletonClone deep = SingletonClone.getInstance();
        List<String> list = new ArrayList<>();
        list.add("Java");
        deep.setList(list);
        SingletonClone deepClone = deep.clone();
        deepClone.getList().add("Python");
        System.out.println(deep);
        System.out.println(deepClone);
        System.out.println(deep == deepClone);
        System.out.println(deep.getList() == deepClone.getList());
    }
}
