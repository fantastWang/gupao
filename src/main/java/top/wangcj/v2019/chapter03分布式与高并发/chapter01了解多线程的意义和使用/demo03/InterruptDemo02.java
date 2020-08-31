package top.wangcj.v2019.chapter03分布式与高并发.chapter01了解多线程的意义和使用.demo03;

/***
 * @Author wangchaojie
 * @Description 中断有睡眠操作的线程
 * @Date 2020/5/27 21:41
 * @return
 **/
public class InterruptDemo02 implements Runnable {
    @Override
    public void run() {
        while (!Thread.currentThread().isInterrupted()){
            try {
                System.out.println("运行："+Thread.currentThread().isInterrupted());
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
                /**JVM层面抛出的异常，会将原本main()中interrupt=true的命令，
                 * 复位成false，此时线程还没有被终止，会一直循环下去
                 * 如果想继续终止该线程，需要再次复位成true：Thread.currentThread().interrupt();
                 **/
                Thread.currentThread().interrupt();
                System.out.println("抛出异常："+Thread.currentThread().isInterrupted());
            }
        }
        System.out.println("中断："+Thread.currentThread().isInterrupted());
    }

    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new InterruptDemo02());
        thread.start();
        Thread.sleep(1000);
        thread.interrupt();
    }
}
