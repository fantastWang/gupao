package top.wangcj.chapter01架构师内功心法.chapter02单例模式.register;


import org.junit.Test;

import java.lang.reflect.Constructor;

public class RegisterEnumTest {

    /**
     * 使用反射形式来创建单例对象
     *
     * @param args
     */
    public static void main(String[] args) {
        try {
            Constructor<?> declaredConstructor = Class.forName("top.wangcj.chapter01架构师内功心法.chapter02单例模式.register.RegisterEnum")
                    .getDeclaredConstructor(String.class, int.class);
            declaredConstructor.setAccessible(true);
            RegisterEnum registerEnum = (RegisterEnum) declaredConstructor.newInstance("wcj", 25);
            System.out.println(registerEnum);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testTom() {
        try {
            //不会初始化静态成员，无输出，除非进行tomClass.newInstance()操作;
            Class<Tom> tomClass = Tom.class;
            //会初始化静态成员，有输出
            Class<?> aClass = Class.forName("top.wangcj.chapter01架构师内功心法.chapter02单例模式.register.Tom");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
