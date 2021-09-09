package com.hz.design.pattern.proxy.dynamic.jdk;

/**
 * @program: design-pattern-learning
 * @author: zgr
 * @create: 2021-09-09 10:14
 **/
public class MainClassJdk {
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
