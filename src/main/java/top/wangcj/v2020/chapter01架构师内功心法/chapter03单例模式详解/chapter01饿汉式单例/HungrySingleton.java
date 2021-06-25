package top.wangcj.v2020.chapter01架构师内功心法.chapter03单例模式详解.chapter01饿汉式单例;

/**
 * @author wangchaojie
 * @Description TODO
 * @Date 2020/9/2 11:01
 **/
public class HungrySingleton {
    //全局访问需要静态修饰
    private static final HungrySingleton hungrySingleton = new HungrySingleton();
    //构造器私有
    private HungrySingleton(){};
    //提供静态公共方法获取实例
    public static HungrySingleton getInstance(){
        return hungrySingleton;
    }
}
