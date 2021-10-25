package com.hz.design.pattern.flyweight;

import java.text.MessageFormat;

/**
 * @program: design-pattern-learning
 * @author: zgr
 * @create: 2021-10-22 15:22
 **/
public class ConcreteWebsite implements Website {

    @Override
    public void postBlog(User user) {
        System.out.println(MessageFormat.format("{0}用户，简介是{1}，上传博客", user.getName(), user.getDesc()));
    }

    @Override
    public void uploadPicture(User user) {
        System.out.println(MessageFormat.format("{0}用户，简介是{1}，上传图片", user.getName(), user.getDesc()));
    }
}
