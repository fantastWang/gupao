package top.wangcj.v2020.chapter01架构师内功心法.chapter02设计模式总览及工厂模式.chapter02工厂方法;

/**
 * @author wangchaojie
 * @Description TODO
 * @Date 2020/9/1 16:06
 **/
public class Test {
    public static void main(String[] args) {
        ICourserFactory factory = new PythonCourseFactory();
        factory.create().study();
    }
}
