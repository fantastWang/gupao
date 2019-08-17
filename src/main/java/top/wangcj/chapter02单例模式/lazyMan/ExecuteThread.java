package top.wangcj.chapter02单例模式.lazyMan;

/**
 * 模拟执行线程，去创建单例对象
 * @author wangchaojie
 * @description
 * @date 2019/8/17 10:55
 */
public class ExecuteThread implements Runnable {
    @Override
    public void run() {
        OptimizeLazyMan02 instance = OptimizeLazyMan02.getInstance();
        System.out.println(Thread.currentThread().getName() + "：" + instance);
    }
}
