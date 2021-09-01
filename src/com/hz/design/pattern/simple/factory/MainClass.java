package com.hz.design.pattern.simple.factory;

import com.hz.design.pattern.simple.factory.entity.CommonComment;
import com.hz.design.pattern.simple.factory.mapper.Mapper;

import java.util.Scanner;

/**
 * @program: design-pattern-learning
 * @author: zgr
 * @create: 2021-09-01 16:23
 **/
public class MainClass {
    public static void main(String[] args) {

        boolean flag = true;
        while (flag) {
            //模拟接口参数
            Scanner sc = new Scanner(System.in);
            String identity = sc.nextLine();
            if (identity.equals("exit")) {
                flag = false;
            } else {

                //模拟接口接待的审核结果body
                CommonComment comment = new CommonComment();
                comment.setId(1);
                comment.setCommentContent("审核内容");
                comment.setCommentResult("yes");

                Mapper mapper = SimpleFactory.createMapper(identity);
                if (mapper == null) {
                    System.out.println("身份标识参数输入错误");
                    continue;
                }
                mapper.saveEntity(SimpleFactory.createCommentEntity(identity, comment));
            }
        }

    }
}
