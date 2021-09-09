package com.hz.design.pattern.proxy.dynamic.jdk;


import java.lang.reflect.Proxy;

/**
 * @program: design-pattern-learning
 * @author: zgr
 * @create: 2021-09-08 10:24
 **/
public class Buyer {

    MySell mySell = new LiNing();

    public void buyGloves() {
        MyInvocationHandler myInvocationHandler = new MyInvocationHandler(mySell);
        MySell proxy = (MySell) Proxy.newProxyInstance(myInvocationHandler.getClass().getClassLoader(), mySell.getClass().getInterfaces(), myInvocationHandler);
        Object result = proxy.sellGloves();
        System.out.println(result);
        ;
    }

    public void buySocks() {
        MyInvocationHandler myInvocationHandler = new MyInvocationHandler(mySell);
        MySell proxy = (MySell) Proxy.newProxyInstance(myInvocationHandler.getClass().getClassLoader(), mySell.getClass().getInterfaces(), myInvocationHandler);
        Object result = proxy.sellSocks();
        System.out.println(result);
        ;
    }

    public void buyShoes() {
        MyInvocationHandler myInvocationHandler = new MyInvocationHandler(mySell);
        MySell proxy = (MySell) Proxy.newProxyInstance(myInvocationHandler.getClass().getClassLoader(), mySell.getClass().getInterfaces(), myInvocationHandler);
        Object result = proxy.sellShoes();
        System.out.println(result);
        ;

    }
}
