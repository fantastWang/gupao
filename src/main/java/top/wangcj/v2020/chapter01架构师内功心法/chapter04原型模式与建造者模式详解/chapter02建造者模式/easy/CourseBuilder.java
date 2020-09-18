package top.wangcj.v2020.chapter01架构师内功心法.chapter04原型模式与建造者模式详解.chapter02建造者模式.easy;

/**
 * @author wangchaojie
 * @Description TODO
 * @Date 2020/9/8 15:48
 **/
public class CourseBuilder {
    private Course course = new Course();
    public void setVideo(String name){
        course.setVideo(name);
    }
    public void setNote(String name){
        course.setNote(name);
    }
    public void setName(String name){
        course.setName(name);
    }
    public Course builder(){
        return course;
    }
}
