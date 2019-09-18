package top.wangcj.chapter04代理模式.dynamicProxy.jdkProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author wangchaojie
 * @description 房屋中介
 * @date 2019/8/30 12:00
 */
public class HouseIntermediaryProxy implements InvocationHandler {

    /**
     * 持有对象的引用
     */
    private Object person;

    public Object getInstance(Object person) {
        this.person = person;
        Class<?> clazz = person.getClass();
        return Proxy.newProxyInstance(clazz.getClassLoader(), clazz.getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //前置增强方法
        before();
        //反射调用this.person对象中的method方法
        Object invoke = method.invoke(this.person, args);
        //后置增强方法
        after();
        return invoke;
    }

    private void before() {
        System.out.println("获取所有的待售房源数据");
    }

    private void after() {
        System.out.println("选出用户满足的并带领办理购房");
    }
}
