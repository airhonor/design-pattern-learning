package com.hz.design.pattern.facade;

/**
 * @program: design-pattern-learning
 * @author: zgr
 * @create: 2021-09-24 10:53
 **/
public class MainClass {
    public static void main(String[] args) {
        MyFacade facade = new MyFacade();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("我是一号服务员，请点菜");
        facade.buyMealA();

        System.out.println();
        System.out.println("我是二号服务员，请点菜");
        facade.buyMealB();

    }
}
