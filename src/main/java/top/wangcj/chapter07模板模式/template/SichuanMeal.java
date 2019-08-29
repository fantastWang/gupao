package top.wangcj.chapter07模板模式.template;

/**
 * @author wangchaojie
 * @description
 * @date 2019/8/27 14:33
 */
public class SichuanMeal extends CookMeal {

    @Override
    protected void cook() {
        System.out.println("加辣椒。。。");
        System.out.println("加辣椒。。。");
        System.out.println("加辣椒。。。");
        System.out.println("加辣椒。。。");
        System.out.println("出锅。。。");
    }
}
