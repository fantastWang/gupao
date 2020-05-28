package top.wangcj.chapter03分布式与高并发.chapter02并发编程的挑战;

/**
 * @author wangchaojie
 * @Description 多线程自增场景
 * @Date 2020/5/28 20:01
 **/
public class demo01 {
    public static int count = 0;
    public static void incr() {
        count++;
    }
    public static void main(String[] args) {
        for (int i = 0; i < 1000; i++) {
            new Thread(() -> {
                demo01.incr();
            }).start();
        }
        //结果是小于等于1000的随机数
        System.out.println("运行结果" + count);
    }
}
