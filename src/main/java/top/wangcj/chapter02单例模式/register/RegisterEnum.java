package top.wangcj.chapter02单例模式.register;

/**
 * 注册式单例之枚举单例
 */
public enum RegisterEnum {

    INSTANCE;

    public static RegisterEnum getInstance() {
        return INSTANCE;
    }
}
