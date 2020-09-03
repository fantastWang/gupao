package top.wangcj.v2020.chapter01架构师内功心法.chapter03单例模式详解.chapter04容器式单例;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/***
 * @Author wangchaojie
 * @Description 容器式单例
 * @Date 2020/9/2 20:54
 **/
public class ContainerSingleton {
    private ContainerSingleton() {
    }
    private static Map<String, ContainerSingleton> ioc = new ConcurrentHashMap<>();
    public static ContainerSingleton getInstance(String className) {
        //存在则直接返回
        if (ioc.containsKey(className)) {
            return ioc.get(className);
        }
        //不存在，则创建后返回
        ContainerSingleton instance = null;
        try {
            instance = (ContainerSingleton) Class.forName(className).newInstance();
            ioc.put(className,instance);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return instance;
    }
}
