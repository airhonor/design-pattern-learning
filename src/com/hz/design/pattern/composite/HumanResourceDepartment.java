package com.hz.design.pattern.composite;

import java.text.MessageFormat;

/**
 * @program: design-pattern-learning
 * @author: zgr
 * @create: 2021-10-21 11:23
 * @desc: 人力资源部
 **/
public class HumanResourceDepartment implements Company {

    private String name;

    public HumanResourceDepartment(String name) {
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
        System.out.println(MessageFormat.format("{0}负责管理公司人事所有事务", name));
    }
}

