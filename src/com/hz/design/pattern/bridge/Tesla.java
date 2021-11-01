package com.hz.design.pattern.bridge;

/**
 * @program: design-pattern-learning
 * @author: zgr
 * @create: 2021-11-01 15:05
 **/
public class Tesla implements Car {
    private ConcreteColor color = new ConcreteColor();
    private ModelFactory modelFactory = new ModelFactory();

    @Override
    public void setColor(int code) {
        System.out.println(color.printColor(code));
    }

    @Override
    public void setModel(int code) {
        System.out.println(modelFactory.getModel(code));
    }
}
