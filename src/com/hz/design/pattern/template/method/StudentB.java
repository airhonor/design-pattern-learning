package com.hz.design.pattern.template.method;

/**
 * @program: design-pattern-learning
 * @author: zgr
 * @create: 2021-09-23 11:03
 **/
public class StudentB extends MyDinner {

    @Override
    public void printStudentIdentity() {
        System.out.println("我是学生B");
    }

    @Override
    public void haveMeal() {
        System.out.println("考试没考好，就吃个最便宜的拉面吧");
    }

    @Override
    public void goAfterMeal() {
        System.out.println("接着去自习室吧，我需要好好复习了");
    }
}
