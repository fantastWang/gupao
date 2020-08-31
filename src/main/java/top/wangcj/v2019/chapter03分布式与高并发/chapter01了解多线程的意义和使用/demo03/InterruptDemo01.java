package top.wangcj.v2019.chapter03分布式与高并发.chapter01了解多线程的意义和使用.demo03;

/***
 * @Author wangchaojie
 * @Description 中断没有睡眠操作的线程
 * @Date 2020/5/27 21:41
 * @return
 **/
public class InterruptDemo01 implements Runnable {
    @Override
    public void run() {
        /**默认返回是false**/
        while (!Thread.currentThread().isInterrupted()) {
            System.out.println(Thread.currentThread().isInterrupted());
        }
        System.out.println(Thread.currentThread().isInterrupted());
        System.out.println("中断线程");
    }

    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new InterruptDemo01());
        thread.start();
        /**睡眠的作用在于，让线程start()起来，等会中断，方便看一下执行结果，不然可能还没运行就被立刻中断了**/
        Thread.sleep(1000);
        /**将interrupt设置为true**/
        thread.interrupt();
    }
}
