package com.hz.design.pattern.proxy.dynamic.jdk;

/**
 * @program: design-pattern-learning
 * @author: zgr
 * @create: 2021-09-08 10:08
 **/
public class LiNing implements MySell {

    @Override
    public String sellGloves() {
        return "卖李宁的手套";
    }

    @Override
    public String sellSocks() {
        return "卖李宁的袜子";
    }

    @Override
    public String sellShoes() {
        return "卖李宁的鞋子";
    }
}
