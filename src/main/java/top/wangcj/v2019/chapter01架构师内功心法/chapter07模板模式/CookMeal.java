package top.wangcj.v2019.chapter01架构师内功心法.chapter07模板模式;

/**
 * @author wangchaojie
 * @description 做菜的流程定义，由父类定义公有的方法，子类去实现各自独有的功能
 * 使用抽象类，不仅可以定义实现父类的基础功能，还可以扩展，不方便在于得遵循Java的单继承
 * 不使用接口，因为接口只能定义，没有实现，基本功能只定义不让子类实现没有意义
 * @date 2019/8/27 11:46
 */
public abstract class CookMeal {

    public void cooking() {
        /**
         * 公有的方法：洗菜、切菜，将其使用private或final修饰，不让子类重写
         **/
        this.wash();
        this.cut();

        /**
         * 做饭的方式不一样，可供子类去实现个性
         */
        this.cook();
    }

    protected abstract void cook();

    private void cut() {
        System.out.println("切菜");
    }

    private void wash() {
        System.out.println("洗菜");
    }
}