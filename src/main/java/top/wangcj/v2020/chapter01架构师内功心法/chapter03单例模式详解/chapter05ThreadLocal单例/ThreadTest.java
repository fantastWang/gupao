package top.wangcj.v2020.chapter01架构师内功心法.chapter03单例模式详解.chapter05ThreadLocal单例;

/**
 * @author wangchaojie
 * @Description TODO
 * @Date 2020/9/3 14:26
 **/
public class ThreadTest implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "：" + ThreadLocalSingleton.getInstance());
        System.out.println(Thread.currentThread().getName() + "：" + ThreadLocalSingleton.getInstance());
    }
}
