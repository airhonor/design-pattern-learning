package com.hz.design.pattern.proxy.statical;

/**
 * @program: design-pattern-learning
 * @author: zgr
 * @create: 2021-09-08 10:24
 **/
public class Buyer {

    private TaoBaoProxy taoBao;

    public Buyer() {
        taoBao = new TaoBaoProxy();
    }

    public void buyGloves() {
        System.out.println("想要买手套");
        System.out.println(taoBao.sellGloves());
    }

    public void buySocks() {
        System.out.println("想要买袜子");
        System.out.println(taoBao.sellSocks());
    }

    public void buyShoes() {
        System.out.println("想要买鞋子");
        System.out.println(taoBao.sellShoes());
    }
}
