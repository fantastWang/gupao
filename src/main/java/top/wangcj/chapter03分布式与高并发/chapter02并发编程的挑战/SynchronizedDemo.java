package top.wangcj.chapter03分布式与高并发.chapter02并发编程的挑战;

/**
 * @author wangchaojie
 * @Description synchronized同步锁
 * @Date 2020/5/29 16:24
 **/
public class SynchronizedDemo {
    Object lock = new Object();

    public SynchronizedDemo(Object lock) {
        this.lock = lock;
    }

    //两种用法：实际上两种方法是等价的，只是修饰的范围不同
    synchronized void method() {
    }

    //代码块层面，更灵活，需要修饰的范围更精确
    Object object = new Object();

    public void method02() {
        synchronized (object) {
        }
    }

    //两种方法锁的范围是等价的，都是类锁
    synchronized static void method03() {
    }

    public void method04() {
        synchronized (SynchronizedDemo.class) {
        }
    }

    public void method05(){
        synchronized (lock){

        }
    }

    public static void main(String[] args) {
        /**
         * 场景：两个线程去访问同一个实例对象的实例方法
         **/
        Object lock = new Object();
        SynchronizedDemo demo = new SynchronizedDemo(lock);
        SynchronizedDemo demo1 = new SynchronizedDemo(lock);
        new Thread(() -> {
            while (true) {
                demo.method05();
            }

        }, "thread01").start();
        new Thread(() -> {
            while (true) {
                demo1.method05();
            }
        }, "thread02").start();
    }
}
