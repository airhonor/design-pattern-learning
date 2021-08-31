package com.hz.design.pattern.observer;

/**
 * @program: design-pattern-learning
 * @author: zgr
 * @create: 2021-08-31 14:56
 **/
public interface Source {

    /**
     * 添加观察者
     *
     * @param object 观察者实例
     * @param methodName 执行方法名称
     * @param args 方法的参数
     */
    void addListener(Object object, String methodName, Object...args);

    /**
     * 通知
     * @throws Exception
     */
    void subscribeNotice() throws Exception;
}
