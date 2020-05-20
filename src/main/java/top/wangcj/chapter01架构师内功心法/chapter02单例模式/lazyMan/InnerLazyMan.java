package top.wangcj.chapter01架构师内功心法.chapter02单例模式.lazyMan;

/**
 * 全程没有用到synchronized关键字，性能最优
 * 内部类单例模式
 *
 * @author wangchaojie
 * @description
 * @date 2019/8/17 16:07
 */
public class InnerLazyMan {

    /**
     * 虽然构造方法私有了，但是反射还是可以创建的
     */
    private InnerLazyMan() {
        if(InnerMan.INNER_LAZY_MAN!=null){
            throw new RuntimeException("不能创建更多的实例了");
        }
    }

    /**
     * 当用户调用时，内部类才会执行
     * 这是JVM底层的执行逻辑，完全的避免了线程安全问题
     *
     * @return
     */
    public static final InnerLazyMan getInstance() {
        return InnerMan.INNER_LAZY_MAN;
    }

    /**
     * 这个内部类是饿汉式的，但是如果外部类没有调用getInstance()，那么内部类是不会被执行的
     */
    private static class InnerMan {
        private static final InnerLazyMan INNER_LAZY_MAN = new InnerLazyMan();
    }
}
