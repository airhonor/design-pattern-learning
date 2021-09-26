package com.hz.design.pattern.builder;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: design-pattern-learning
 * @author: zgr
 * @create: 2021-09-26 11:08
 **/
public class Computer {
    List<String> components = new ArrayList<>();

    public void show() {
        System.out.println("computer include: ");
        for (String s : components) {
            System.out.println(s);
        }
    }
}
