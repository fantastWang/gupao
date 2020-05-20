package top.wangcj.chapter01架构师内功心法.chapter07模板模式;

/**
 * @author wangchaojie
 * @description 模板测试类
 * @date 2019/8/27 17:22
 */
public class TemplateTest {
    public static void main(String[] args) {
        CookMeal meal = new AnhuiMeal();
        meal.cooking();
        System.out.println("=========");
        meal = new SichuanMeal();
        meal.cooking();
    }
}
