package top.wangcj.v2020.chapter01架构师内功心法.chapter03单例模式详解.chapter03枚举式单例;

public enum EnumSingleton {
    instance;
    private static EnumSingleton getInstance(){
        return instance;
    }
}
