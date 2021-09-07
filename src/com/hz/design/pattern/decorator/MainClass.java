package com.hz.design.pattern.decorator;

/**
 * @program: design-pattern-learning
 * @author: zgr
 * @create: 2021-09-07 11:57
 **/
public class MainClass {
    public static void main(String[] args) {
        System.out.println("-----------------1--------------------");
        KaBuDa commonKaBuDa = new CommonKaBuDa();
        commonKaBuDa.display();
        System.out.println("-----------------2--------------------");
        System.out.println("蜻蜓队长: 比赛开始");
        System.out.println("-----------------3--------------------");
        KaBuDa transfigurationKaBuDa = new TransfigurationKaBuDa(commonKaBuDa);
        transfigurationKaBuDa.display();
        System.out.println("-----------------4--------------------");
        System.out.println("呼唤卡布达巨人");
        System.out.println("-----------------5--------------------");
        KaBuDa giantKaBuDa = new GiantKaBuDa(transfigurationKaBuDa);
        giantKaBuDa.display();
    }
}
