package com.hz.design.pattern.decorator;

/**
 * @program: design-pattern-learning
 * @author: zgr
 * @create: 2021-09-07 15:49
 **/
public class GiantKaBuDa extends Decorator {

    public GiantKaBuDa(KaBuDa kaBuDa) {
        super(kaBuDa);
    }

    @Override
    public void display() {
        super.display();
        System.out.println("超级卡布达巨人");
    }
}
