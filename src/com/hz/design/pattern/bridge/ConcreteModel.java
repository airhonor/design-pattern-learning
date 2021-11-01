package com.hz.design.pattern.bridge;

/**
 * @program: design-pattern-learning
 * @author: zgr
 * @create: 2021-11-01 14:30
 **/
public class ConcreteModel {

    private ModelFactory modelFactory = new ModelFactory();

    public String printColor(int code) {
        return modelFactory.getModel(code);
    }
}
