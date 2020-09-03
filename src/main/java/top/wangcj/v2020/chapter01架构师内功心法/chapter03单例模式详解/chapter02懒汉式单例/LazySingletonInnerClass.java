package top.wangcj.v2020.chapter01架构师内功心法.chapter03单例模式详解.chapter02懒汉式单例;

/**
 * @author wangchaojie
 * @Description 静态内部类懒汉式单例
 * @Date 2020/9/2 16:48
 **/
public class LazySingletonInnerClass {
    private LazySingletonInnerClass(){}
    public static LazySingletonInnerClass getInstance(){
        return InnerClass.inner;
    }
    private static class InnerClass{
        private static final LazySingletonInnerClass inner = new LazySingletonInnerClass();
    }
}
