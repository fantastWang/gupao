package top.wangcj.chapter05委派模式.generalDelegate;

import top.wangcj.chapter05委派模式.generalDelegate.Chef;

/**
 * 大老板：负责命令主厨做事情
 */
public class Boss {
    public void command(String command, Chef chef) {
        chef.command(command);
    }
}
