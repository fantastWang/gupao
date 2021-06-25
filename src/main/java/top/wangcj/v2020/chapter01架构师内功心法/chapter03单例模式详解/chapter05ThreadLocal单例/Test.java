package top.wangcj.v2020.chapter01架构师内功心法.chapter03单例模式详解.chapter05ThreadLocal单例;

/**
 * @author wangchaojie
 * @Description TODO
 * @Date 2021/6/25 15:46
 **/
public class Test {
    public static void main(String[] args) {
        //主线程调用
        System.out.println("主线程：" + Thread.currentThread().getName() + ":" + ThreadLocalSingleton.getInstance());
        System.out.println("主线程：" + Thread.currentThread().getName() + ":" + ThreadLocalSingleton.getInstance());
        System.out.println("主线程：" + Thread.currentThread().getName() + ":" + ThreadLocalSingleton.getInstance());
        Thread t1 = new Thread(new ThreadTest());
        Thread t2 = new Thread(new ThreadTest());
        t1.start();
        t2.start();
    }
}
