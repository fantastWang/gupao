package top.wangcj.v2020.chapter01架构师内功心法.chapter01七大软件设计原则.chapter01开闭原则;

/**
 * @author wangchaojie
 * @Description TODO
 * @Date 2020/8/31 15:25
 **/
public class Test {

    public static void main(String[] args) {
        ICourse course = new ExtJavaCourse("Java课程", 1800D);
        ExtJavaCourse javaCourse = (ExtJavaCourse) course;
        System.out.println("课程名称：" + javaCourse.getName() + "\n"
                + "课程价格：" + javaCourse.getPrice() + "\n"
                + "折后价格：" + javaCourse.getExtPrice());
    }
}
