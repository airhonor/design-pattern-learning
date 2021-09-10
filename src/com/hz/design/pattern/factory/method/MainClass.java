package com.hz.design.pattern.factory.method;

import com.hz.design.pattern.factory.method.MyFactory.MerchantCommentFactory;
import com.hz.design.pattern.factory.method.MyFactory.MerchantCommentMapperFactory;
import com.hz.design.pattern.factory.method.MyFactory.UserCommentFactory;
import com.hz.design.pattern.factory.method.MyFactory.UserCommentMapperFactory;
import com.hz.design.pattern.factory.method.mapper.Mapper;

import java.util.Scanner;

/**
 * @program: design-pattern-learning
 * @author: zgr
 * @create: 2021-09-10 10:29
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
                //在客户端代码添加逻辑判断
                if (identity.equals("user")) {
                    Mapper mapper = new UserCommentMapperFactory().createMapper();
                    mapper.saveEntity(new UserCommentFactory().createComment());
                } else if (identity.equals("merchant")) {
                    Mapper mapper = new MerchantCommentMapperFactory().createMapper();
                    mapper.saveEntity(new MerchantCommentFactory().createComment());
                } else {
                    System.out.println("身份标识参数输入错误");
                    continue;
                }
            }
        }
    }
}
