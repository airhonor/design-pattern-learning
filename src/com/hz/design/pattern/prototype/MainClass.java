package com.hz.design.pattern.prototype;

import java.io.IOException;

/**
 * @program: design-pattern-learning
 * @author: zgr
 * @create: 2021-09-15 09:48
 **/
public class MainClass {

    public static void main(String[] args) {
        try {
            Staff staff = new Staff(200);
            SunWuKong sunWuKong1 = new SunWuKong();
            sunWuKong1.setNumber(1);
            sunWuKong1.setDesc("我是1号");
            sunWuKong1.setStaff(staff);
            System.out.println(sunWuKong1);
            System.out.println("*****************浅拷贝*******************");
            SunWuKong sunWuKong2 = (SunWuKong) sunWuKong1.clone();

            staff.setSize(300);
            sunWuKong2.setNumber(2);
            sunWuKong2.setDesc("我原来是1号，我现在变2号");
            System.out.println(sunWuKong1);
            System.out.println(sunWuKong2);


            System.out.println("*****************深拷贝*******************");
            SunWuKong sunWuKong3 = (SunWuKong) sunWuKong1.deepClone();
            staff.setSize(400);
            sunWuKong3.setNumber(3);
            sunWuKong3.setDesc("我是深拷贝3号");
            System.out.println(sunWuKong1);
            System.out.println(sunWuKong2);
            System.out.println(sunWuKong3);
        } catch (CloneNotSupportedException e) {
            System.out.println("对象不能被克隆");
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
