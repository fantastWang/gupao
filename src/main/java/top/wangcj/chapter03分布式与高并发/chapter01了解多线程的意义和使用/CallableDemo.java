package top.wangcj.chapter03分布式与高并发.chapter01了解多线程的意义和使用;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * 用Callable/Future实现线程
 */
public class CallableDemo implements Callable {
    @Override
    public String call() throws Exception {
        System.out.println("线程体执行");
        Thread.sleep(1000);
        return "1";
    }

    public static void main(String[] args) throws Exception {
        ExecutorService service = Executors.newFixedThreadPool(1);
        CallableDemo callableDemo = new CallableDemo();
        Future future = service.submit(callableDemo);
        /**get()是阻塞的，如果线程sleep了，需要等待执行完成才能拿到返回值**/
        System.out.println(future.get());
    }
}
