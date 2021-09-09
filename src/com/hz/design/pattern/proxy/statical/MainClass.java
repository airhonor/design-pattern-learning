package com.hz.design.pattern.proxy.statical;

/**
 * @program: design-pattern-learning
 * @author: zgr
 * @create: 2021-09-08 09:56
 **/
public class MainClass {
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
