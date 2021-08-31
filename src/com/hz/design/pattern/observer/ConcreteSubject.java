package com.hz.design.pattern.observer;

import java.util.HashSet;
import java.util.Set;

/**
 * @program: design-pattern-learning
 * @author: zgr
 * @create: 2021-08-31 11:02
 **/



public class ConcreteSubject implements Subject{

    //确保观察者不会重复存在
    Set<Observer> observers = new HashSet<>();

    @Override
    public void addObserver(Observer observer) {
        if (observer == null){
            throw new NullPointerException("观察者不允许为空");
        }
        observers.add(observer);
    }

    @Override
    public void deleteObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyAll(String msg) {
        for (Observer o: observers) {
            o.update(this, msg);
        }
    }
}
