package top.wangcj.v2019.chapter01架构师内功心法.chapter05委派模式.generalDelegate;

/**
 * 粤菜师傅根据命令制作美食
 */
public class GudongCuisine implements Cook {
    @Override
    public void cook(String command) {
        System.out.println("开始制作粤菜。。。" + command);
    }
}
