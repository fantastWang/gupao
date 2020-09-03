package top.wangcj.v2020.chapter01架构师内功心法.chapter03单例模式详解.chapter05ThreadLocal单例;

/**
 * @author wangchaojie
 * @Description TODO
 * @Date 2020/9/3 14:13
 **/
public class ThreadLocalSingleton {
    private ThreadLocalSingleton(){}
    private static final ThreadLocal<ThreadLocalSingleton> threadLocal = new ThreadLocal<ThreadLocalSingleton>(){
        @Override
        protected ThreadLocalSingleton initialValue() {
            return new ThreadLocalSingleton();
        }
    };
    public static ThreadLocalSingleton getInstance(){
        return threadLocal.get();
    }
}
