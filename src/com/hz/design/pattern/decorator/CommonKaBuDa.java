package com.hz.design.pattern.decorator;

/**
 * @program: design-pattern-learning
 * @author: zgr
 * @create: 2021-09-07 14:49
 **/
public class CommonKaBuDa implements KaBuDa {

    @Override
    public void display() {
        System.out.println("我是普通卡布达，卡布卡布卡布");
    }
}
