package top.wangcj.v2020.chapter01架构师内功心法.chapter03单例模式详解.chapter03枚举式单例;

/**
 * @author wangchaojie
 * @Description TODO
 * @Date 2021/6/25 14:54
 **/
public class EnumSingletonTest {
    public static void main(String[] args) {
//        Class<EnumSingleton> singletonClass = EnumSingleton.class;
//        try {
//            Constructor<EnumSingleton> constructor = singletonClass.getDeclaredConstructor(String.class, int.class);
//            constructor.setAccessible(true);
//            System.out.println(constructor.newInstance());
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

        try {
            Class<ClassName> classNameClass = ClassName.class;
            Class.forName("top.wangcj.v2020.chapter01架构师内功心法.chapter03单例模式详解.chapter03枚举式单例.ClassName");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
