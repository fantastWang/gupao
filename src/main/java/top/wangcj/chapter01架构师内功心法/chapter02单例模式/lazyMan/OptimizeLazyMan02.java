package top.wangcj.chapter01架构师内功心法.chapter02单例模式.lazyMan;

/**
 * 优化版
 *
 * @author wangchaojie
 * @description
 * @date 2019/8/17 10:52
 */
public class OptimizeLazyMan02 {

    private static OptimizeLazyMan02 lazyMan = null;

    private OptimizeLazyMan02() {

    }

    /**
     * 因为之前的是用synchronized修饰静态方法，是类锁，效率较低
     * 使用双重检查锁机制，可以稍加优化
     *
     * @return
     */
    public static OptimizeLazyMan02 getInstance() {
        if (lazyMan == null) {
            synchronized (OptimizeLazyMan02.class){
                if(lazyMan == null){
                    lazyMan = new OptimizeLazyMan02();
                }
            }
        }
        return lazyMan;
    }
}
