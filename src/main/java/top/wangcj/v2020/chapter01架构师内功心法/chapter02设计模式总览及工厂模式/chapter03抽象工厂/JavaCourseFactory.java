package top.wangcj.v2020.chapter01架构师内功心法.chapter02设计模式总览及工厂模式.chapter03抽象工厂;

/**
 * @author wangchaojie
 * @Description TODO
 * @Date 2020/9/2 10:00
 **/
public class JavaCourseFactory implements ICourseFactory {
    @Override
    public IVideo getVideo() {
        return new JavaVideo();
    }

    @Override
    public INote getNote() {
        return new JavaNote();
    }
}
