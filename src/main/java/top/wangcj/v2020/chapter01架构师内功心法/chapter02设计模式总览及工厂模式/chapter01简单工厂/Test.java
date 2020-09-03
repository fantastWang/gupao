package top.wangcj.v2020.chapter01架构师内功心法.chapter02设计模式总览及工厂模式.chapter01简单工厂;

/**
 * @author wangchaojie
 * @Description TODO
 * @Date 2020/9/1 14:59
 **/
public class Test {
    public static void main(String[] args) {
        CourseFactory factory = new CourseFactory();
        ICourse course = factory.createCourse(PythonCourse.class);
        course.study();
    }
}
