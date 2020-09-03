package top.wangcj.v2020.chapter01架构师内功心法.chapter03单例模式详解.chapter01饿汉式单例;

/**
 * @author wangchaojie
 * @Description TODO
 * @Date 2020/9/2 11:01
 **/
public class HungryStaticSingleton {
    private static HungryStaticSingleton hungrySingleton;
    static {
        hungrySingleton = new HungryStaticSingleton();
    }
    //构造器私有
    private HungryStaticSingleton(){};
    //提供静态公共方法获取实例
    public static HungryStaticSingleton getInstance(){
        return hungrySingleton;
    }
}
