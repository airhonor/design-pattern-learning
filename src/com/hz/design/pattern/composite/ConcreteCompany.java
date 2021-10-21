package com.hz.design.pattern.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: design-pattern-learning
 * @author: zgr
 * @create: 2021-10-21 11:12
 * @desc: 总院，包含各职能部门以及下属各分院
 **/
public class ConcreteCompany implements Company {
    private final List<Company> children = new ArrayList<>();

    private final String name;

    public ConcreteCompany(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void add(Company c) {
        children.add(c);
    }

    @Override
    public void remove(Company c) {
        children.remove(c);
    }

    @Override
    public void disPlay(int depth) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < depth; i++) {
            sb.append("-");
        }
        System.out.println(sb.toString() + getName());
        for (Company c : children) {
            c.disPlay(depth + 2);
        }
    }

    @Override
    public void displayDuty() {
        for (Company c : children) {
            c.displayDuty();
        }
    }
}
