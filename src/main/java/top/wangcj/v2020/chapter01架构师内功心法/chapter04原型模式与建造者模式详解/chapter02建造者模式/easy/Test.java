package top.wangcj.v2020.chapter01架构师内功心法.chapter04原型模式与建造者模式详解.chapter02建造者模式.easy;

/**
 * @author wangchaojie
 * @Description TODO
 * @Date 2020/9/8 15:51
 **/
public class Test {
    public static void main(String[] args) {
        CourseBuilder builder = new CourseBuilder();
        builder.setName("name");
        builder.setVideo("video");
        System.out.println(builder.builder());
    }
}
