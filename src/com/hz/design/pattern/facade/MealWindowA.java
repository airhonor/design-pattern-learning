package com.hz.design.pattern.facade;

/**
 * @program: design-pattern-learning
 * @author: zgr
 * @create: 2021-09-24 10:55
 **/
public class MealWindowA {

    public MealWindowA() {
        System.out.println("食堂饭菜A窗口，主营陕西特色");
    }


    public void sellOilNoddles() {
        System.out.println("好吃不贵的油泼面啦！");
    }

    public void sellSaoZiNoddles() {
        System.out.println("好吃不贵的臊子面啦！");
    }

    public void sellSpecialNoddles() {
        System.out.println("好吃不贵的Biáng Biáng面啦！");
    }
}
