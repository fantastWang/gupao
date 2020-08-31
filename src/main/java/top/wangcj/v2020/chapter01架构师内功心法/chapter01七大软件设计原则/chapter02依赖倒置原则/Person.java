package top.wangcj.v2020.chapter01架构师内功心法.chapter01七大软件设计原则.chapter02依赖倒置原则;

/**
 * @author wangchaojie
 * @Description TODO
 * @Date 2020/8/31 16:12
 **/
public class Person {
    String study(ICourse course) {
        return course.study();
    }
}
