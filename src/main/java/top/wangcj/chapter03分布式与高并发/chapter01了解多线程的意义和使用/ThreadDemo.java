package top.wangcj.chapter03分布式与高并发.chapter01了解多线程的意义和使用;

import org.junit.Test;

/**
 * 用Thread实现线程
 */
public class ThreadDemo extends Thread {

    @Override
    public void run() {
        try {
            //线程休眠两秒
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("线程运行了");
    }

    /**
     * 这里体现了线程的异步性
     * TestDemo的run()中休眠了2秒，但是执行时没有等待休眠完成才执行Main method，
     * 而是先执行了主函数的代码，后执行了线程中的代码
     *
     * @param args
     */
    public static void main(String[] args) {
        ThreadDemo t = new ThreadDemo();
        t.start();
        System.out.println("Main method");
    }

    @Test
    public void test() {

    }
}
