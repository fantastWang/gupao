package top.wangcj.chapter04代理模式.dynamicProxy.wcjProxy;

import java.lang.reflect.Method;

public interface WCJInvocationHandler {

    Object invoke(Object proxy, Method method, Object[] args)
            throws Throwable;
}
