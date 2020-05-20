package top.wangcj.chapter01架构师内功心法.chapter04代理模式.staticProxy.advanced;

/**
 * @author wangchaojie
 * @description 数据源切换
 * @date 2019/8/29 11:12
 */
public class DataSourceSwitch {

    /**
     * 假设存储的是不同的数据库实例
     **/
    private static ThreadLocal<String> local = new ThreadLocal<>();

    /**
     * 设置某个实例
     *
     * @param value
     */
    public static void set(String value) {
        local.set(value);
        System.out.println("切换到：" + value + "数据库");
    }

    /**
     * 获取实例
     */
    public static void get() {
        local.get();
    }
}
