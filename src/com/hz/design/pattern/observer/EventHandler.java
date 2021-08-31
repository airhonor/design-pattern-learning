package com.hz.design.pattern.observer;

import lombok.Data;

import java.util.HashSet;
import java.util.Set;

/**
 * @program: design-pattern-learning
 * @author: zgr
 * @create: 2021-08-31 14:37
 **/
@Data
public class EventHandler {

    private Set<Event> events;

    public EventHandler(){
        this.events = new HashSet<>();
    }

     //相当于添加一个事件，关联一个观察者

    public void addEvent(Object object, String methodName, java.lang.Object[] args){
        events.add(new Event(object, methodName, args));
    }

    //发布事件
    public void subscribeNotice() throws Exception {
        for (Event e: events){
            e.invoke();
        }
    }
}
