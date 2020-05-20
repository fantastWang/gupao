package top.wangcj.chapter01架构师内功心法.chapter02单例模式.lazyMan;

/**
 * @author wangchaojie
 * @description
 * @date 2019/8/17 10:54
 */
public class SingletonTest {

    public static void main(String[] args) {
        //生成两个线程去访问得到对象，看是否是一致
        Thread t1 = new Thread(new ExecuteThread());
        Thread t2 = new Thread(new ExecuteThread());
        t1.start();
        t2.start();
    }
}