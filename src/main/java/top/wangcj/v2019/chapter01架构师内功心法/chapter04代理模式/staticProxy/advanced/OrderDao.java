package top.wangcj.v2019.chapter01架构师内功心法.chapter04代理模式.staticProxy.advanced;

/**
 * @author wangchaojie
 * @description
 * @date 2019/8/29 11:08
 */
public class OrderDao {

    public void add(Order order){
        System.out.println("dao执行添加");
    }
}
