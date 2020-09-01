package top.wangcj.v2020.chapter01架构师内功心法.chapter01七大软件设计原则.chapter06里式替换原则;

import java.util.Map;

/**
 * @author wangchaojie
 * @Description TODO
 * @Date 2020/9/1 8:42
 **/
public class Child extends Parent {
    //入参比父类更宽松
    void eat(Map map) {
        System.out.println("执行子类Map方法");
    }
}
