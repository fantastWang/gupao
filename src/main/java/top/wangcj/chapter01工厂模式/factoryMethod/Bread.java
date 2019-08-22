package top.wangcj.chapter01工厂模式.factoryMethod;

/**
 * 面包对象
 *
 * @author wangchaojie
 * @description
 * @date 2019/8/16 15:07
 */
public class Bread implements IFood {
    @Override
    public void create() {
        System.out.println("生产了一块面包");
    }
}
