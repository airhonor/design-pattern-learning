package com.hz.design.pattern.builder;

/**
 * @program: design-pattern-learning
 * @author: zgr
 * @create: 2021-09-26 12:04
 **/
public class QuantaBuilder implements TelephoneBuilder {
    private Telephone telephone;

    public QuantaBuilder() {
        this.telephone = new Telephone();
    }

    @Override
    public TelephoneBuilder constructBoard() {
        telephone.components.add("apple board");
        return this;
    }

    @Override
    public TelephoneBuilder constructCpu() {
        telephone.components.add("apple cpu");
        return this;
    }

    @Override
    public TelephoneBuilder constructMemory() {
        telephone.components.add("apple memory");
        return this;
    }

    @Override
    public TelephoneBuilder constructCase() {
        telephone.components.add("apple case");
        return this;
    }

    @Override
    public Telephone getTelephone() {
        return telephone;
    }
}
