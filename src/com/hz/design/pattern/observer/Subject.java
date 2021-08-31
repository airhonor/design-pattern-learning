package com.hz.design.pattern.observer;

/**
 * @program: design-pattern-learning
 * @author: zgr
 * @create: 2021-08-31 10:47
 * @description: 通知者的接口
 **/

public interface Subject {

    /**
     * 添加观察者
     *
     * @param observer 观察者
     */
    void addObserver(Observer observer);

    /**
     * 删除观察者
     *
     * @param observer 观察者
     */
    void deleteObserver(Observer observer);

    /**
     * 通知观察者
     *
     * @param msg 通知信息
     */
    void notifyAll(String msg);
}
