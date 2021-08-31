package com.hz.design.pattern.observer;

/**
 * @program: design-pattern-learning
 * @author: zgr
 * @create: 2021-08-31 11:09
 **/

public class GameObserver implements Observer{
    @Override
    public void update(Subject subject, String msg) {
        System.out.println("这里是" + subject.getClass() + "," + msg + "请停止打游戏");
    }
}
