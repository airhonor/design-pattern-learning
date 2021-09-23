package com.hz.design.pattern.template.method;

/**
 * @program: design-pattern-learning
 * @author: zgr
 * @create: 2021-09-23 10:51
 **/
public class MainClass {

    public static void main(String[] args) {
        MyDinner studentA = new StudentA();
        studentA.templateMethod();

        System.out.println("**********************************");

        MyDinner studentB = new StudentB();
        studentB.templateMethod();
    }

}
