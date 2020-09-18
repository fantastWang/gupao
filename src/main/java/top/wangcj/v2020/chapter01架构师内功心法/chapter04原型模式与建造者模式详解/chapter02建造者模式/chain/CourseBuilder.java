package top.wangcj.v2020.chapter01架构师内功心法.chapter04原型模式与建造者模式详解.chapter02建造者模式.chain;

/**
 * @author wangchaojie
 * @Description 链式编程
 * @Date 2020/9/8 15:48
 **/
public class CourseBuilder {
    private Course course = new Course();
    public CourseBuilder setVideo(String name){
        course.setVideo(name);
        return this;
    }
    public CourseBuilder setNote(String name){
        course.setNote(name);
        return this;
    }
    public CourseBuilder setName(String name){
        course.setName(name);
        return this;
    }
    public Course builder(){
        return course;
    }
}
