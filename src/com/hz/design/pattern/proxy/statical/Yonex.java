package com.hz.design.pattern.proxy.statical;

/**
 * @program: design-pattern-learning
 * @author: zgr
 * @create: 2021-09-08 10:08
 **/
public class Yonex implements Sell {

    @Override
    public String sellGloves() {
        return "卖尤尼克斯的手套";
    }

    @Override
    public String sellSocks() {
        return "卖尤尼克斯的袜子";
    }

    @Override
    public String sellShoes() {
        return "卖尤尼克斯的鞋子";
    }
}
