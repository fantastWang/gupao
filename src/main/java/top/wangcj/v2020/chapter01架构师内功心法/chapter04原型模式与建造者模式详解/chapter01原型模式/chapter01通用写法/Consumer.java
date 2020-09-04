package top.wangcj.v2020.chapter01架构师内功心法.chapter04原型模式与建造者模式详解.chapter01原型模式.chapter01通用写法;

import lombok.Data;

import java.util.List;

/**
 * @author wangchaojie
 * @Description 具体原型对象实现抽象接口
 * @Date 2020/9/3 17:12
 **/
@Data
public class Consumer implements IPrototype {
    private String name;
    private List<String> list;
    @Override
    public Consumer clone() {
        //可以使用反射，BeanUtils，手动拷贝方式都行
        Consumer consumer = new Consumer();
        consumer.setName(this.name);
        consumer.setList(this.list);
        return consumer;
    }
    @Override
    public String toString() {
        return "Consumer{" +
                "name='" + name + '\'' +
                ", list=" + list +
                '}';
    }
}
