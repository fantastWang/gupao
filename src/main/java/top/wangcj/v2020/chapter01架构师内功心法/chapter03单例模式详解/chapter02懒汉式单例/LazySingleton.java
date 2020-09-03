package top.wangcj.v2020.chapter01架构师内功心法.chapter03单例模式详解.chapter02懒汉式单例;

/**
 * @author wangchaojie
 * @Description 线程不安全的懒汉式单例
 * @Date 2020/9/2 11:06
 **/
public class LazySingleton {
    private static LazySingleton lazySingleton = null;

    private LazySingleton() {
        try {
            if (lazySingleton != null) {
                throw new Exception("不允许创建多个实例");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static LazySingleton getInstance() {
        if (lazySingleton == null) {
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }
}
