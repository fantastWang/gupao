package top.wangcj.chapter03原型模式.homeWork;

/**
 * @author wangchaojie
 * @description
 * @date 2019/8/22 16:02
 */
public class OrderReq implements Clone {

    private Long orderId;
    private String orderNo;
    private String describe;

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    @Override
    public Object clone() {
        OrderReq req = new OrderReq();
        req.setOrderId(this.orderId);
        req.setOrderNo(this.orderNo);
        req.setDescribe(this.describe);
        return req;
    }
}