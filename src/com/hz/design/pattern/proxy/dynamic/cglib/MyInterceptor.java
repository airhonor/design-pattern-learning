package com.hz.design.pattern.proxy.dynamic.cglib;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @program: design-pattern-learning
 * @author: zgr
 * @create: 2021-09-09 11:40
 **/
public class MyInterceptor implements MethodInterceptor {

    /**
     * 拦截方法
     *
     * @param o           代理的目标对象
     * @param method      目标对象的方法
     * @param objects     参数
     * @param methodProxy CGlib方法代理对象
     * @return 代理方法返回值
     * @throws Throwable 异常
     */
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("我是CGLIB淘宝代理");
        return methodProxy.invokeSuper(o, objects);
    }
}
