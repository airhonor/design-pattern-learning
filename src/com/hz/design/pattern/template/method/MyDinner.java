package com.hz.design.pattern.template.method;

/**
 * @program: design-pattern-learning
 * @author: zgr
 * @create: 2021-09-23 10:52
 **/
public abstract class MyDinner {

    public void templateMethod() {

        printStudentIdentity();
        /**
         * 下课一起去食堂吃饭，大家走去食堂方式一样，去食堂打的饭菜不一样，吃完饭回的地方不一样，有人回宿舍，有人回教室
         */

        walk();

        haveMeal();

        goAfterMeal();
    }

    /**
     * 打印学生身份
     */
    public abstract void printStudentIdentity();

    public void walk() {
        System.out.println("到点了，走去吃晚饭");
    }

    /**
     * 打饭，具体打什么菜
     */
    public abstract void haveMeal();

    /**
     * 吃完饭后去哪儿
     */
    public abstract void goAfterMeal();
}
