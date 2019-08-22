package top.wangcj.chapter01工厂模式.factoryMethod;

/**
 * @author wangchaojie
 * @description
 * @date 2019/8/16 15:09
 */
public class FoodTest {
    public static void main(String[] args) {
        IFoodFatory foodFatory = new BreadFactory();
        foodFatory.createFood().create();
    }
}
