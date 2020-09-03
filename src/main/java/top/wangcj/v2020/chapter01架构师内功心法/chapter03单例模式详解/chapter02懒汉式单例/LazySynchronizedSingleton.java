package top.wangcj.v2020.chapter01架构师内功心法.chapter03单例模式详解.chapter02懒汉式单例;

/**
 * @author wangchaojie
 * @Description 线程安全的懒汉式单例
 * @Date 2020/9/2 11:06
 **/
public class LazySynchronizedSingleton {
    private static LazySynchronizedSingleton lazySingleton = null;

    private LazySynchronizedSingleton() {
    }

    public synchronized static LazySynchronizedSingleton getInstance() {
        if (lazySingleton == null) {
            lazySingleton = new LazySynchronizedSingleton();
        }
        return lazySingleton;
    }
}
