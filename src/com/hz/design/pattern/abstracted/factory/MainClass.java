package com.hz.design.pattern.abstracted.factory;

import com.hz.design.pattern.abstracted.factory.mapper.Mapper;

import java.util.Scanner;

/**
 * @program: design-pattern-learning
 * @author: zgr
 * @create: 2021-09-23 10:51
 **/
public class MainClass {

    public static void main(String[] args) {
        boolean flag = true;
        while (flag) {
            //模拟接口参数
            Scanner sc = new Scanner(System.in);
            String identity = sc.nextLine();
            if (identity.equals("exit")) {
                System.out.println("退出系统");
                flag = false;
            } else {
                if (identity.equals("user")) {
                    MyAbstractFactory factory = new UserCommentConcreteFactory();
                    Mapper mapper = factory.createMapperInstance();
                    mapper.saveEntity(factory.createCommentInstance());
                } else if (identity.equals("merchant")) {
                    MyAbstractFactory factory = new MerchantCommentConcreteFactory();
                    Mapper mapper = factory.createMapperInstance();
                    mapper.saveEntity(factory.createCommentInstance());
                } else {
                    System.out.println("身份标识参数输入错误");
                    continue;
                }
            }
        }
    }
}
