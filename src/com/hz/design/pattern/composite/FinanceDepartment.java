package com.hz.design.pattern.composite;

import java.text.MessageFormat;

/**
 * @program: design-pattern-learning
 * @author: zgr
 * @create: 2021-10-21 11:29
 * @desc: 财务部门
 **/
public class FinanceDepartment implements Company {

    private String name;

    public FinanceDepartment(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void add(Company c) {

    }

    @Override
    public void remove(Company c) {

    }

    @Override
    public void disPlay(int depth) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < depth; i++) {
            sb.append("-");
        }
        System.out.println(sb.toString() + getName());
    }

    @Override
    public void displayDuty() {
        System.out.println(MessageFormat.format("{0}负责管理公司财务所有事务", name));
    }
}
