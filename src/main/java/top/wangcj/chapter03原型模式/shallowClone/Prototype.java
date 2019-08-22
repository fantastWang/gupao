package top.wangcj.chapter03原型模式.shallowClone;

/**
 * 原型接口，提供clone方法
 */
public interface Prototype {

    /**
     * 返回一个clone后的原型对象
     *
     * @return
     */
    Prototype clone();
}
