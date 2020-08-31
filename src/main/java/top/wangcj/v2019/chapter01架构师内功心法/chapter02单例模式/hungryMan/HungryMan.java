package top.wangcj.v2019.chapter01架构师内功心法.chapter02单例模式.hungryMan;

/**
 * 饿汉式单例
 * 1、构造器私有，防止被别人使用new关键字创建对象
 * 2、提供一个对外方法，供外部调用
 *
 * @author wangchaojie
 * @description
 * @date 2019/8/16 17:37
 */
public class HungryMan {

    /**
     * 第一种写法：静态成员创建该类实例
     * 写成final是为了防止被反射获取后，进行变量的覆盖
     */
    private static final HungryMan HUNGRY_MAN = new HungryMan();

    /**
     * 第二种写法：在静态块中创建该类实例
     */
//    static {
//        HUNGRY_MAN = new HungryMan();
//    }
    private HungryMan() {

    }

    /**
     * 提供唯一一个对外的方法，供外部调用该类实例
     *
     * @return
     */
    public static HungryMan getInstance() {
        return HUNGRY_MAN;
    }
}
