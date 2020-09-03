package top.wangcj.v2020.chapter01架构师内功心法.chapter02设计模式总览及工厂模式.chapter02工厂方法;


import top.wangcj.v2020.chapter01架构师内功心法.chapter02设计模式总览及工厂模式.chapter01简单工厂.ICourse;
import top.wangcj.v2020.chapter01架构师内功心法.chapter02设计模式总览及工厂模式.chapter01简单工厂.PythonCourse;

/**
 * @author wangchaojie
 * @Description TODO
 * @Date 2020/9/1 16:06
 **/
public class PythonCourseFactory implements ICourserFactory {
    @Override
    public ICourse create() {
        return new PythonCourse();
    }
}
