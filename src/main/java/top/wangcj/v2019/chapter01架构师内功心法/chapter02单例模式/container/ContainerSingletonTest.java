package top.wangcj.v2019.chapter01架构师内功心法.chapter02单例模式.container;

/**
 * 测试容器式单例线程
 *
 * @author wangchaojie
 * @description
 * @date 2019/8/19 10:02
 */
public class ContainerSingletonTest {
    public static void main(String[] args) {
        try {
            ConcurrentExecutor.execute(new ConcurrentExecutor.RunHandler() {
                public void handler() {
                    Object obj = ContainerSingleton.getInstance("top.wangcj.chapter02单例模式.container.User");
                    ;
                    System.out.println(System.currentTimeMillis() + ": " + obj);
                }
            }, 10, 6);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
