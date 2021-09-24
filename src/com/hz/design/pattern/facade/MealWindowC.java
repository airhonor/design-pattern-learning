package com.hz.design.pattern.facade;

/**
 * @program: design-pattern-learning
 * @author: zgr
 * @create: 2021-09-24 10:55
 **/
public class MealWindowC {

    public MealWindowC() {
        System.out.println("食堂饭菜C窗口，主营东北特色");
    }


    public void sellChickenWithMushrooms() {
        System.out.println("贼拉好吃的小鸡炖蘑菇！");
    }

    public void sellShaZhuCai() {
        System.out.println("贼拉好吃的酸菜汆白肉！");
    }

    public void sellGuoBaoRou() {
        System.out.println("贼拉好吃的锅包肉！");
    }
}
