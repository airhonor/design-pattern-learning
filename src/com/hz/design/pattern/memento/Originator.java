package com.hz.design.pattern.memento;

import lombok.Data;

/**
 * @program: design-pattern-learning
 * @author: zgr
 * @create: 2021-10-14 10:49
 **/
@Data
public class Originator {

    private BeautifulGirl girl;

    public Originator(BeautifulGirl girl) {
        this.girl = girl;
    }

    //存储
    public BeautifulGirl createMemento() {
        return this.getGirl();
    }

    //恢复
    public void restoreMemento(BeautifulGirl girl) {
        this.setGirl(girl);
    }
}
