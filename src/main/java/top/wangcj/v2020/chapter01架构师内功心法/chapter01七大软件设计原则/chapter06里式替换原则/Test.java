package top.wangcj.v2020.chapter01架构师内功心法.chapter01七大软件设计原则.chapter06里式替换原则;

import java.util.HashMap;

/**
 * @author wangchaojie
 * @Description TODO
 * @Date 2020/9/1 8:45
 **/
public class Test {
    public static void main(String[] args) {
        //无论使用父类还是子类对象，结果都没有影响
        Parent parent = new Child();
        Parent child = new Child();
        parent.eat(new HashMap());
        child.eat(new HashMap());
    }
}
