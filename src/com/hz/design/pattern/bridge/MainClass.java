package com.hz.design.pattern.bridge;

/**
 * @program: design-pattern-learning
 * @author: zgr
 * @create: 2021-11-01 14:24
 **/
public class MainClass {
    public static void main(String[] args) {
        Tesla teslaFactory = new Tesla();
        System.out.println("配置颜色与车型：");
        teslaFactory.setColor(3);
        teslaFactory.setModel(2);
    }
}
