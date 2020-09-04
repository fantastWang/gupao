package top.wangcj.v2020.chapter01架构师内功心法.chapter04原型模式与建造者模式详解.chapter02建造者模式;

/**
 * @author wangchaojie
 * @Description TODO
 * @Date 2020/9/4 16:53
 **/
public class Test {
    public static void main(String[] args) {
        IBuilder iBuilder = new BuilderImpl();
        System.out.println(iBuilder.build());
    }
}
