package top.wangcj.v2019.chapter01架构师内功心法.chapter03原型模式.homeWork;

/**
 * @author wangchaojie
 * @description
 * @date 2019/8/22 16:05
 */
public class OrderDto {

    public Object startClone(Clone clone) {
        return clone.clone();
    }
}
