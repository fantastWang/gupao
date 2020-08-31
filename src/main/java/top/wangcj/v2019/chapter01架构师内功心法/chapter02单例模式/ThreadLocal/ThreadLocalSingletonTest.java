package top.wangcj.v2019.chapter01架构师内功心法.chapter02单例模式.ThreadLocal;

import top.wangcj.v2019.chapter01架构师内功心法.chapter02单例模式.lazyMan.ExecuteThread;

/**
 * @author wangchaojie
 * @description
 * @date 2019/8/19 14:26
 */
public class ThreadLocalSingletonTest {

    public static void main(String[] args) {
//        System.out.println(Thread.currentThread().getName()+"："+ThreadLocalSingleton.getInstance());
//        System.out.println(Thread.currentThread().getName()+"："+ThreadLocalSingleton.getInstance());
//        System.out.println(Thread.currentThread().getName()+"："+ThreadLocalSingleton.getInstance());
        Thread t1 = new Thread(new ExecuteThread());
        Thread t2 = new Thread(new ExecuteThread());
        t1.start();
        t2.start();
    }
}
