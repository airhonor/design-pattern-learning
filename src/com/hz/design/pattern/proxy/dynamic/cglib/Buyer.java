package com.hz.design.pattern.proxy.dynamic.cglib;


import net.sf.cglib.proxy.Enhancer;

/**
 * @program: design-pattern-learning
 * @author: zgr
 * @create: 2021-09-09 11:43
 **/
public class Buyer {

    public void buyGloves() {
        Victor victor = getVictor();
        System.out.println(victor.sellGloves());
    }

    public void buySocks() {
        Victor victor = getVictor();
        System.out.println(victor.sellSocks());
    }

    public void buyShoes() {
        Victor victor = getVictor();
        System.out.println(victor.sellShoes());

    }


    private Victor getVictor() {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(Victor.class);
        enhancer.setCallback(new MyInterceptor());
        return (Victor) enhancer.create();
    }
}
