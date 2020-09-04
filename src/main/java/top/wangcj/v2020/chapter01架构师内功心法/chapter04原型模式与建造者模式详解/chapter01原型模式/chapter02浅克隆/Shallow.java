package top.wangcj.v2020.chapter01架构师内功心法.chapter04原型模式与建造者模式详解.chapter01原型模式.chapter02浅克隆;

import lombok.Data;

import java.util.List;

/**
 * @author wangchaojie
 * @Description 浅克隆
 * @Date 2020/9/4 9:44
 **/
@Data
public class Shallow implements Cloneable {
    private String name;
    private List<String> list;
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
