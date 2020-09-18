package top.wangcj.v2020.chapter01架构师内功心法.chapter04原型模式与建造者模式详解.chapter02建造者模式.chain;

/**
 * @author wangchaojie
 * @Description 链式调用
 * @Date 2020/9/8 15:51
 **/
public class Test {
    public static void main(String[] args) {
        CourseBuilder builder = new CourseBuilder()
                .setName("name")
                .setVideo("video");
        System.out.println(builder.builder());
    }
}
