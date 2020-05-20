package top.wangcj.chapter01架构师内功心法.chapter04代理模式.staticProxy.advanced;

/**
 * @author wangchaojie
 * @description 订单类
 * @date 2019/8/29 11:08
 */
public class Order {

    private Long id;
    private String date;
    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
