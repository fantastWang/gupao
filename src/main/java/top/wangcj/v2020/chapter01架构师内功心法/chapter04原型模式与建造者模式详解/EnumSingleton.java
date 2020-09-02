package top.wangcj.v2020.chapter01架构师内功心法.chapter04原型模式与建造者模式详解;

public enum EnumSingleton {
    instance;
    private static EnumSingleton getInstance(){
        return instance;
    }
}
