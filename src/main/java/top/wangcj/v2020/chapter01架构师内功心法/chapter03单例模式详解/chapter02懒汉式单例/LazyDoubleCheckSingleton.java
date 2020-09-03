package top.wangcj.v2020.chapter01架构师内功心法.chapter03单例模式详解.chapter02懒汉式单例;

/**
 * @author wangchaojie
 * @Description 双重检查锁
 * @Date 2020/9/2 11:06
 **/
public class LazyDoubleCheckSingleton {
    //添加volatile关键字解决指令重排序问题
    private volatile static LazyDoubleCheckSingleton lazySingleton = null;

    private LazyDoubleCheckSingleton() {
    }

    public static LazyDoubleCheckSingleton getInstance() {
        //是否进行资源争夺
        if (lazySingleton == null) {
            synchronized (LazyDoubleCheckSingleton.class) {
                //是否进行过实例化
                if (lazySingleton == null) {
                    lazySingleton = new LazyDoubleCheckSingleton();
                }
            }
        }
        return lazySingleton;
    }
}
