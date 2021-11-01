package com.hz.design.pattern.bridge;

/**
 * @program: design-pattern-learning
 * @author: zgr
 * @create: 2021-11-01 14:30
 **/
public class ConcreteColor {

    private ColorFactory colorFactory = new ColorFactory();

    public String printColor(int code) {
        return colorFactory.getColor(code);
    }
}
