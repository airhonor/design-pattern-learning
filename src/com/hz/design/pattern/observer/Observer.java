package com.hz.design.pattern.observer;

/**
 * @program: design-pattern-learning
 * @author: zgr
 * @create: 2021-08-31 10:47
 * @description: 观察者的接口
 **/

public interface Observer {


    /**
     * 接收到通知，更新自我的状态
     *
     * @param subject 通知者
     * @param msg 通知信息
     */
    void update(Subject subject, String msg);
}
