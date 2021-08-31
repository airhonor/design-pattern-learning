package com.hz.design.pattern.observer;

/**
 * @program: design-pattern-learning
 * @author: zgr
 * @create: 2021-08-31 14:59
 **/
public class ConcreteSource implements Source{

    private final EventHandler eventHandler = new EventHandler();

    @Override
    public void addListener(Object object, String methodName, Object...args) {
        eventHandler.addEvent(object, methodName, args);
    }

    @Override
    public void subscribeNotice() throws Exception {
        eventHandler.subscribeNotice();
    }
}
