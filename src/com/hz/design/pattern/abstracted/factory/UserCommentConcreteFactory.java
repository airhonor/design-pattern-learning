package com.hz.design.pattern.abstracted.factory;

import com.hz.design.pattern.abstracted.factory.entity.CommonComment;
import com.hz.design.pattern.abstracted.factory.entity.UserComment;
import com.hz.design.pattern.abstracted.factory.mapper.Mapper;
import com.hz.design.pattern.abstracted.factory.mapper.UserCommentMapper;

/**
 * @program: design-pattern-learning
 * @author: zgr
 * @create: 2021-09-29 11:08
 **/
public class UserCommentConcreteFactory implements MyAbstractFactory {
    @Override
    public Mapper createMapperInstance() {
        return new UserCommentMapper();
    }

    @Override
    public CommonComment createCommentInstance() {
        UserComment userComment = new UserComment();
        userComment.setId(1);
        userComment.setCommentContent("用户评论类容");
        userComment.setCommentResult("用户评论审核结果");
        userComment.setUserName("hello，我是用户评论");
        return userComment;
    }
}
