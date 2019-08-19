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

    /**
     * 虽然ConcurrentHashMap是线程安全的类，但是实际上线程不安全的方法是getInstance()
     */
    private static Map<String, Object> singleton = new ConcurrentHashMap<>();

    public static Object getInstance(String className) {
        synchronized (singleton){
            if (!singleton.containsKey(className)) {
                Object obj = null;
                try {
                    obj = Class.forName(className).newInstance();
                    singleton.put(className, obj);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                return obj;
            }
            return singleton.get(className);
        }
    }
}
