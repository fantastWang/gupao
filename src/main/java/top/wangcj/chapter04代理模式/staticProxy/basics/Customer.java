package top.wangcj.chapter04代理模式.staticProxy.basics;

/**
 * 顾客
 *
 * @author wangchaojie
 * @description
 * @date 2019/8/22 17:39
 */
public class Customer implements Person {
    @Override
    public void eat() {
        System.out.println("蒸熊掌、蒸鹿尾儿、烧花鸭");
    }
}
