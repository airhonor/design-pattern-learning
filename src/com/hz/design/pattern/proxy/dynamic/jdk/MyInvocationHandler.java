package com.hz.design.pattern.proxy.dynamic.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @program: design-pattern-learning
 * @author: zgr
 * @create: 2021-09-08 11:55
 **/
public class MyInvocationHandler implements InvocationHandler {

    private MySell mySell;

    public MyInvocationHandler(MySell mySell) {
        this.mySell = mySell;
    }

    /**
     * 执行代理方法
     *
     * @param proxy  被动态代理的对象
     * @param method 代理执行的方法
     * @param args   执行的参数
     * @return method方法执行返回的参数
     * @throws Throwable 异常
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("我是JDK淘宝代理");
        return method.invoke(mySell, args);
    }
}
