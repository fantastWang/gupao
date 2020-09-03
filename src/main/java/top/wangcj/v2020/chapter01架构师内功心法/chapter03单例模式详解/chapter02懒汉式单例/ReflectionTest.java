package top.wangcj.v2020.chapter01架构师内功心法.chapter03单例模式详解.chapter02懒汉式单例;

import java.lang.reflect.Constructor;

/**
 * @author wangchaojie
 * @Description TODO
 * @Date 2020/9/2 16:53
 **/
public class ReflectionTest {
    public static void main(String[] args) {
        Class<LazySingleton> singletonClass = LazySingleton.class;
        try {
            Constructor<LazySingleton> declaredConstructor = singletonClass.
                    getDeclaredConstructor(null);
            //强制访问：非private的方法属性
            declaredConstructor.setAccessible(true);
            System.out.println(declaredConstructor.newInstance());
            System.out.println(declaredConstructor.newInstance());
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
