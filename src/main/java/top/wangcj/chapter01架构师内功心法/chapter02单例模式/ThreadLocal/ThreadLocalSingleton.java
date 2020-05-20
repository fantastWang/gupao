package top.wangcj.chapter01架构师内功心法.chapter02单例模式.ThreadLocal;

/**
 * ThreadLocal单例模式
 * 线程间的线程安全，伪线程安全的
 *
 * @author wangchaojie
 * @description
 * @date 2019/8/19 11:45
 */
public class ThreadLocalSingleton {

    private static final ThreadLocal<ThreadLocalSingleton> threadLocal = new ThreadLocal<ThreadLocalSingleton>() {
        //重写initialValue方法
        @Override
        protected ThreadLocalSingleton initialValue() {
            return new ThreadLocalSingleton();
        }
    };

    private ThreadLocalSingleton() {
    }

    public static ThreadLocalSingleton getInstance() {
        return threadLocal.get();
    }
}
