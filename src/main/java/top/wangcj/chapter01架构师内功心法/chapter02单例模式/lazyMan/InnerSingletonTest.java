package top.wangcj.chapter01架构师内功心法.chapter02单例模式.lazyMan;

import java.lang.reflect.Constructor;

/**
 * @author wangchaojie
 * @description
 * @date 2019/8/17 16:16
 */
public class InnerSingletonTest {
    public static void main(String[] args) {
        try {
            //通过反射得到对象
            Class<InnerLazyMan> lazyManClass = InnerLazyMan.class;
            //getDeclaredConstructor()返回所有构造器，包括public的和非public的，当然也包括private的
            //getConstructor()返回访问权限是public的构造器
            Constructor<InnerLazyMan> constructor = lazyManClass.getDeclaredConstructor();
            //值为true表示反射的对象在使用时应该取消访问权限检查,值为false表示开启
            constructor.setAccessible(true);
            InnerLazyMan innerLazyMan = constructor.newInstance();
            InnerLazyMan instance = InnerLazyMan.getInstance();
            //判断两个对象是否是同一个对象
            System.out.println(innerLazyMan==instance);
        }catch (Exception r){
            r.printStackTrace();
        }
    }
}
