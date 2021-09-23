package com.hz.design.pattern.template.method;

/**
 * @program: design-pattern-learning
 * @author: zgr
 * @create: 2021-09-23 11:01
 **/
public class StudentA extends MyDinner {

    @Override
    public void printStudentIdentity() {
        System.out.println("我是学生A");
    }

    @Override
    public void haveMeal() {
        System.out.println("今天心情不错，来一个麻辣香锅，重麻重辣");
    }

    @Override
    public void goAfterMeal() {
        System.out.println("吃饱喝足，回宿舍再睡一觉，简直美吱吱");
    }
}
