package top.wangcj.v2020.chapter01架构师内功心法.chapter03单例模式详解.chapter04容器式单例;

import java.io.Serializable;

/**
 * @author wangchaojie
 * @Description TODO
 * @Date 2020/9/3 10:03
 **/
public class SerializeSingleton implements Serializable {
    private static final SerializeSingleton singleton = new SerializeSingleton();
    private SerializeSingleton(){}
    public static SerializeSingleton getInstance(){
        return singleton;
    }
    private Object readResolve(){
        return singleton;
    }
}
