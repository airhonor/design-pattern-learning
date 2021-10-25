package com.hz.design.pattern.flyweight;

/**
 * @program: design-pattern-learning
 * @author: zgr
 * @create: 2021-10-22 11:28
 * @desc: 抽象享元接口
 **/
public interface Website {

    /**
     * 发布博客
     *
     * @param user 用户
     */
    void postBlog(User user);


    /**
     * 上传图片
     *
     * @param user 用户
     */
    void uploadPicture(User user);
}
