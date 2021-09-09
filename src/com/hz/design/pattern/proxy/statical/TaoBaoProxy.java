package com.hz.design.pattern.proxy.statical;

/**
 * @program: design-pattern-learning
 * @author: zgr
 * @create: 2021-09-08 10:10
 **/
public class TaoBaoProxy implements Sell {
    private final Yonex yonex;

    private String COMMON_PEDDLE = "我是淘宝代理，";

    public TaoBaoProxy() {
        yonex = new Yonex();
    }

    @Override
    public String sellGloves() {
        return COMMON_PEDDLE + yonex.sellGloves();
    }

    @Override
    public String sellSocks() {
        return COMMON_PEDDLE + yonex.sellSocks();
    }

    @Override
    public String sellShoes() {
        return COMMON_PEDDLE + yonex.sellShoes();
    }
}
