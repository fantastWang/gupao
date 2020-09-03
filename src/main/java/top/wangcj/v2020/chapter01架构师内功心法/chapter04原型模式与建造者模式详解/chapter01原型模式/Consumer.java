package top.wangcj.v2020.chapter01架构师内功心法.chapter04原型模式与建造者模式详解.chapter01原型模式;

/**
 * @author wangchaojie
 * @Description 具体原型对象实现抽象接口
 * @Date 2020/9/3 17:12
 **/
public class Consumer implements IPrototype {
    private String name;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public Consumer clone() {
        //可以使用反射，BeanUtils，手动拷贝方式都行
        Consumer consumer = new Consumer();
        consumer.setName(this.name);
        return consumer;
    }
    @Override
    public String toString() {
        return "Consumer{" +
                "name='" + name + '\'' +
                '}';
    }
}
