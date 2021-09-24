package com.hz.design.pattern.facade;

/**
 * @program: design-pattern-learning
 * @author: zgr
 * @create: 2021-09-24 11:01
 **/
public class MealWindowB {
    public MealWindowB() {
        System.out.println("食堂饭菜B窗口，主营四川特色");
    }


    public void sellFish() {
        System.out.println("巴适得板的水煮鱼哈！");
    }


    public void sellMeat() {
        System.out.println("巴适得板的水煮肉片哈！");
    }

    public void sellBlood() {
        System.out.println("巴适得板的毛血旺哈！");
    }
}
