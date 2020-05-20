package top.wangcj.chapter01架构师内功心法.chapter02单例模式.lazyMan;

import java.io.Serializable;

/**
 * 序列化式的创建单例模式
 *
 * @author wangchaojie
 * @description
 * @date 2019/8/17 16:43
 */
public class SerializableLazyMan implements Serializable {

    private static SerializableLazyMan serializableLazyMan = null;

    private SerializableLazyMan() {

    }

    public static SerializableLazyMan getInstance() {
        if (serializableLazyMan == null) {
            serializableLazyMan = new SerializableLazyMan();
        }
        return serializableLazyMan;
    }

    /**
     * 思考：为什么加了这个方法，序列化方式也是单例的
     * 解答：重写readResolve()，只不过是覆盖了反序列化中的对象，还是创建了两次，发生在JVM层次中的，
     * 相对来说比较安全，之前反序列出来的对象会被GC回收
     * @return
     */
    private Object readResolve() {
        return serializableLazyMan;
    }

}
