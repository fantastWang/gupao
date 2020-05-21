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
                    TimeUnit.SECONDS.sleep(100);//一种阻塞状态
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }, "Thread01").start();

        new Thread(() -> {
            while (true) {
                synchronized (Demo02.class) {
                    try {
                        Demo02.class.wait();//另一种阻塞状态
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }, "Thread02").start();

        //创建两个线程去抢夺资源
        new Thread(new BlockDemo(), "BlockDemo-01").start();
        new Thread(new BlockDemo(), "BlockDemo-02").start();
    }

    static class BlockDemo extends Thread {
        @Override
        public void run() {
            synchronized (BlockDemo.class) {
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
