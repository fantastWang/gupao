package top.wangcj.chapter03分布式与高并发.chapter01了解多线程的意义和使用.demo02;

import java.util.concurrent.TimeUnit;

/**
 * @Author wangchaojie
 * @Description 线程基础：线程的生命周期
 * @Date 2020/5/21 22:35
 **/
public class Demo02 {

    public static void main(String[] args) {
        new Thread(() -> {
            while (true) {
                try {
                    /**线程会变成一种阻塞状态 TIMED_WAITING：sleep(1)是一种定时器的概念，当时间结束会交给CPU时间片调度执行**/
                    TimeUnit.SECONDS.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }, "Thread01").start();

        new Thread(() -> {
            while (true) {
                synchronized (Demo02.class) {
                    try {
                        /**线程会变成另一种阻塞状态 WAITING：因为是wait()引起的阻塞**/
                        Demo02.class.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }, "Thread02").start();

        //创建两个线程去抢占锁
        new Thread(new BlockDemo(), "BlockDemo-01").start(); /**首先抢占了线程，因为sleep了所以是TIMED_WAITING**/
        new Thread(new BlockDemo(), "BlockDemo-02").start(); /**被别的线程一直持有，无法抢占，所以是BLOCKED**/
    }

    static class BlockDemo extends Thread {
        @Override
        public void run() {
            synchronized (BlockDemo.class) {
                /**让抢到线程的线程一直持有这把锁**/
                while (true) {
                    try {
                        TimeUnit.SECONDS.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}
