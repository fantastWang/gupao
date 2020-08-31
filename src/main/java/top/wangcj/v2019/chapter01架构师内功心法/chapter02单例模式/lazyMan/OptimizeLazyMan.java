package top.wangcj.v2019.chapter01架构师内功心法.chapter02单例模式.lazyMan;

/**
 * 第一次优化版
 *
 * @author wangchaojie
 * @description
 * @date 2019/8/17 10:52
 */
public class OptimizeLazyMan {

    private static OptimizeLazyMan lazyMan = null;

    private OptimizeLazyMan() {

    }

    /**
     * 给方法块上添加synchronized关键字,防止多线程情况下拿到的不是同一对象
     * 缺点：虽然在jdk1.6以后对synchronized进行了性能优化，但是还是存在一定的性能问题
     * 可以使用双重检查锁稍加优化
     *
     * @return
     */
    public synchronized static OptimizeLazyMan getInstance() {
        if (lazyMan == null) {
            lazyMan = new OptimizeLazyMan();
        }
        return lazyMan;
    }
}
