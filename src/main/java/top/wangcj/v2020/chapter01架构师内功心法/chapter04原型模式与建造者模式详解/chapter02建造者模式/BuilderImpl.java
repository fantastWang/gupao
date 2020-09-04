package top.wangcj.v2020.chapter01架构师内功心法.chapter04原型模式与建造者模式详解.chapter02建造者模式;

/**
 * @author wangchaojie
 * @Description TODO
 * @Date 2020/9/4 16:52
 **/
public class BuilderImpl implements IBuilder {
    @Override
    public Product build() {
        return new Product();
    }
}
