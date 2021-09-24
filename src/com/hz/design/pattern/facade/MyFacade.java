package com.hz.design.pattern.facade;

/**
 * @program: design-pattern-learning
 * @author: zgr
 * @create: 2021-09-24 11:12
 **/
public class MyFacade {

    private MealWindowA mealWindowA;
    private MealWindowB mealWindowB;
    private MealWindowC mealWindowC;

    public MyFacade() {
        this.mealWindowA = new MealWindowA();
        this.mealWindowB = new MealWindowB();
        this.mealWindowC = new MealWindowC();
    }

    public void buyMealA() {
        mealWindowA.sellSaoZiNoddles();
        mealWindowB.sellBlood();
        mealWindowC.sellGuoBaoRou();
    }

    public void buyMealB() {
        mealWindowB.sellMeat();
        mealWindowB.sellFish();
        mealWindowC.sellShaZhuCai();
    }
}
