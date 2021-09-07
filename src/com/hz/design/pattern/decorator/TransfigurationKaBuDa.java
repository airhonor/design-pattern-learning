package com.hz.design.pattern.decorator;

/**
 * @program: design-pattern-learning
 * @author: zgr
 * @create: 2021-09-07 15:20
 **/
public class TransfigurationKaBuDa extends Decorator {

    public TransfigurationKaBuDa(KaBuDa kaBuDa) {
        super(kaBuDa);
    }

    @Override
    public void display() {
        super.display();
        System.out.println("启动超级变换形态---超级变换形态");
    }
}
