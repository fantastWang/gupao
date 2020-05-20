package top.wangcj.chapter01架构师内功心法.chapter02单例模式.lazyMan;

/**
 * 懒汉式单例
 *
 * @author wangchaojie
 * @description
 * @date 2019/8/16 17:37
 */
public class LazyMan {

    private static LazyMan lazyMan = null;

    private LazyMan() {

    }

    public static LazyMan getInstance() {
        if (lazyMan == null) {
            lazyMan = new LazyMan();
        }
        return lazyMan;
    }
}
