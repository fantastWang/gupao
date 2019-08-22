package top.wangcj.chapter05委派模式.generalDelegate;

/**
 * 委派测试
 */
public class DelegateTest {
    public static void main(String[] args) {
        new Boss().command("粤菜",new Chef());
    }
}