package top.wangcj.chapter05委派模式.generalDelegate;

/**
 * 湘菜师傅根据命令制作美食
 */
public class HunanCuisine implements Cook {
    @Override
    public void cook(String command) {
        System.out.println("开始制作湘菜。。。" + command);
    }
}
