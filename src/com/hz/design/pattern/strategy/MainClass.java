package com.hz.design.pattern.strategy;

import java.util.Scanner;

/**
 * @program: design-pattern-learning
 * @author: zgr
 * @create: 2021-09-03 10:50
 **/
public class MainClass {
    public static void main(String[] args) {
        boolean flag = true;
        while (flag) {
            //模拟天气参数
            Scanner sc = new Scanner(System.in);
            String climate = sc.nextLine();
            if (climate.equals("exit")) {
                flag = false;
            } else {
                ContextStrategy strategy = new ContextStrategy(climate);
                System.out.println(strategy.showWayToWork());
            }
        }
    }
}
