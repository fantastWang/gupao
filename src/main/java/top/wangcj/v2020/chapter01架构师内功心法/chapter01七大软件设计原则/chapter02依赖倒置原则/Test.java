package top.wangcj.v2020.chapter01架构师内功心法.chapter01七大软件设计原则.chapter02依赖倒置原则;

/**
 * @author wangchaojie
 * @Description TODO
 * @Date 2020/8/31 16:12
 **/
public class Test {
    public static void main(String[] args) {
        Person person = new Person();
        //传入不同的课程（可以使用构造器，set方法等不同方式完成）
        System.out.println(person.study(new JavaStudy()));
    }
}
