package top.wangcj.chapter03原型模式.homeWork;

/**
 * @author wangchaojie
 * @description
 * @date 2019/8/22 16:04
 */
public class Test {
    /**
     * 思路
     * 1、由一个接口定义克隆方法
     * 2、提供一个原始对象OrderReq，相当于用户请求实体
     * 3、将用户请求实体属性映射到实际的OrderDto中，用于业务处理
     *
     * @param args
     */
    public static void main(String[] args) {
        OrderReq dto = new OrderReq();
        dto.setOrderId(1000L);
        dto.setOrderNo("SJ_1000");
        dto.setDescribe("商品描述");
        OrderDto vo = new OrderDto();
        OrderReq copy = (OrderReq) vo.startClone(dto);
        System.out.println(dto.getDescribe());
        System.out.println(copy.getDescribe());
        System.out.println(dto.getDescribe() == copy.getDescribe());
    }
}