package top.wangcj.v2019.chapter01架构师内功心法.chapter05委派模式.generalDelegate;

/**
 * 大老板：负责命令主厨做事情
 */
public class Boss {
    public void command(String command, Chef chef) {
        chef.command(command);
    }
}
