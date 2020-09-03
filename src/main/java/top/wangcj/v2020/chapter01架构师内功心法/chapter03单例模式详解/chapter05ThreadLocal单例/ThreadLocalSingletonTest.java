package top.wangcj.v2020.chapter01架构师内功心法.chapter03单例模式详解.chapter05ThreadLocal单例;

/**
 * @author wangchaojie
 * @Description TODO
 * @Date 2020/9/3 14:24
 **/
public class ThreadLocalSingletonTest {
    public static void main(String[] args) {
        //主线程调用
        System.out.println(Thread.currentThread().getName() + "：" + ThreadLocalSingleton.getInstance());
        System.out.println(Thread.currentThread().getName() + "：" + ThreadLocalSingleton.getInstance());
        System.out.println(Thread.currentThread().getName() + "：" + ThreadLocalSingleton.getInstance());
        //不同线程的调用
        Thread t1 = new Thread(new ThreadTest());
        Thread t2 = new Thread(new ThreadTest());
        t1.start();
        t2.start();
    }
}
