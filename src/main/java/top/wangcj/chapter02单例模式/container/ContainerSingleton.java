package top.wangcj.chapter02单例模式.container;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 容器式单例
 *
 * @author wangchaojie
 * @description
 * @date 2019/8/18 19:11
 */
public class ContainerSingleton {
    private ContainerSingleton() {

    }

    private static Map<String, Object> singleton = new ConcurrentHashMap<>();

    public static ContainerSingleton getBean(String className) {
        if (!singleton.containsKey(className)) {
            Object obj = new ContainerSingleton();
        }
        return null;
    }
}
