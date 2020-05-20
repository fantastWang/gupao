package top.wangcj.chapter01架构师内功心法.chapter03原型模式.shallowClone;

/**
 * 用于克隆原对象
 *
 * @author wangchaojie
 * @description
 * @date 2019/8/22 10:53
 */
public class UserVo {

    public Prototype startClone(Prototype prototype) {
        return prototype.clone();
    }
}
