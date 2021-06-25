package top.wangcj.v2020.chapter01架构师内功心法.chapter03单例模式详解.chapter02懒汉式单例;

import java.io.Serializable;

/**
 * @author wangchaojie
 * @Description TODO
 * @Date 2021/6/25 14:48
 **/
public class SingletonMen implements Serializable {
    public static SingletonMen singletonMen = null;
    private SingletonMen(){}
    public static SingletonMen getInstance(){
        if(singletonMen==null){
            singletonMen=new SingletonMen();
        }
        return singletonMen;
    }

}
