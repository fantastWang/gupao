package top.wangcj.v2019.chapter01架构师内功心法.chapter02单例模式.register;

/**
 * @author wangchaojie
 * @description
 * @date 2019/8/18 18:53
 */
public class Tom {

    static int num = 10;

    static {
        System.out.println("被执行了："+num);
    }
}
