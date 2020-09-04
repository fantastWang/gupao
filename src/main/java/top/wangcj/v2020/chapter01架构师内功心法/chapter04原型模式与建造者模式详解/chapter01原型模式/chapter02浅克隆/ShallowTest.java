package top.wangcj.v2020.chapter01架构师内功心法.chapter04原型模式与建造者模式详解.chapter01原型模式.chapter02浅克隆;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wangchaojie
 * @Description TODO
 * @Date 2020/9/4 9:47
 **/
public class ShallowTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        Shallow shallow = new Shallow();
        List<String> list = new ArrayList<>();
        list.add("1");
        shallow.setName("Java");
        shallow.setList(list);
        Shallow clone = (Shallow) shallow.clone();
        //当往克隆对象的list属性中添加值时，原对象的值也会随之添加
        clone.getList().add("2");
        System.out.println(shallow);
        System.out.println(clone);
    }
}
