package top.wangcj.v2020.chapter01架构师内功心法.chapter01七大软件设计原则.chapter01开闭原则;

/**
 * @author wangchaojie
 * @Description TODO
 * @Date 2020/8/31 15:23
 **/
public class JavaCourse implements ICourse {

    private String name;
    private Double price;

    public JavaCourse(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public Double getPrice() {
        return this.price;
    }
}
