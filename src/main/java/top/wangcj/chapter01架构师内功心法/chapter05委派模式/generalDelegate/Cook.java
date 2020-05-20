package top.wangcj.chapter01架构师内功心法.chapter05委派模式.generalDelegate;

/**
 * 厨师有很多个，定义抽象类的抽象方法
 */
public interface Cook {
    /**
     * 去根据命令让对应的厨师做菜
     *
     * @param command
     */
    void cook(String command);
}