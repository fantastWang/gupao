package top.wangcj.chapter07模板模式.template;

/**
 * @author wangchaojie
 * @description
 * @date 2019/8/27 11:47
 */
public class AnhuiMeal extends CookMeal {

    @Override
    protected void cook() {
        System.out.println("开始热油。。。");
        System.out.println("开始下菜。。。");
        System.out.println("开始加调料。。。");
        System.out.println("开始翻炒。。。");
        System.out.println("出锅。。。");
    }
}
