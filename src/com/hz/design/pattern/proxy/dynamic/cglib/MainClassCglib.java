package com.hz.design.pattern.proxy.dynamic.cglib;

/**
 * @program: design-pattern-learning
 * @author: zgr
 * @create: 2021-09-09 11:48
 **/
public class MainClassCglib {
    public static void main(String[] args) {
        Buyer buyer = new Buyer();
        buyer.buyGloves();
        System.out.println("-------------------------------------");
        buyer.buySocks();
        System.out.println("-------------------------------------");
        buyer.buyShoes();
        System.out.println("-------------------------------------");
    }
}
