package top.wangcj.v2019.chapter01架构师内功心法.chapter05委派模式.generalDelegate;

/**
 * 徽菜师傅根据命令制作美食
 */
public class AnhuiCuisine implements Cook {
    @Override
    public void cook(String command) {
        System.out.println("开始制作徽菜。。。" + command);
    }
}
