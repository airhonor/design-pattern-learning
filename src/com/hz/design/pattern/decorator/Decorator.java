package com.hz.design.pattern.decorator;

/**
 * @program: design-pattern-learning
 * @author: zgr
 * @create: 2021-09-07 14:51
 **/
public class Decorator implements KaBuDa {

    private KaBuDa kaBuDa;

    public Decorator(KaBuDa kaBuDa) {
        this.kaBuDa = kaBuDa;
    }


    @Override
    public void display() {
        this.kaBuDa.display();
    }
}
