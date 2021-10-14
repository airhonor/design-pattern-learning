package com.hz.design.pattern.memento;

import java.util.HashMap;
import java.util.Map;

/**
 * @program: design-pattern-learning
 * @author: zgr
 * @create: 2021-10-14 11:21
 **/
public class Caretaker {
    private final Map<Integer, BeautifulGirl> originator = new HashMap<>(16);

    public void setMemento(int seq, BeautifulGirl girl) {
        this.originator.put(seq, girl);
    }

    public BeautifulGirl getMemento(int id) {
        return this.originator.get(id);
    }
}
