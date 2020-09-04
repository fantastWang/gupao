package top.wangcj.v2020.chapter01架构师内功心法.chapter04原型模式与建造者模式详解.chapter01原型模式.chapter03深克隆;

import lombok.Data;

import java.util.List;

/**
 * @author wangchaojie
 * @Description TODO
 * @Date 2020/9/4 14:39
 **/
@Data
public class SingletonClone implements Cloneable {
    private List<String> list;
    private static final SingletonClone SINGLETON_CLONE = new SingletonClone();
    private SingletonClone(){}
    public static SingletonClone getInstance(){
        return SINGLETON_CLONE;
    }
    @Override
    protected SingletonClone clone() {
        return SINGLETON_CLONE;
    }
}
