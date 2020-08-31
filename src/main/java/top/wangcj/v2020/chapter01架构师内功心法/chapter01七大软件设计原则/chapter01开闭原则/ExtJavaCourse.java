package top.wangcj.v2020.chapter01架构师内功心法.chapter01七大软件设计原则.chapter01开闭原则;

/**
 * @author wangchaojie
 * @Description TODO
 * @Date 2020/8/31 15:34
 **/
public class ExtJavaCourse extends JavaCourse {
    public ExtJavaCourse(String name, Double price) {
        super(name, price);
    }
    //新增折后价格
    public Double getExtPrice() {
        return super.getPrice()*0.8;
    }
}
