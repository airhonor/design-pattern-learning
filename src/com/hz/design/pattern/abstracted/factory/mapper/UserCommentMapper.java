package com.hz.design.pattern.abstracted.factory.mapper;

import com.hz.design.pattern.abstracted.factory.entity.UserComment;

/**
 * @program: design-pattern-learning
 * @author: zgr
 * @create: 2021-09-01 16:26
 **/
public class UserCommentMapper implements Mapper<UserComment> {

    @Override
    public void saveEntity(UserComment userComment) {
        System.out.println("存储的是审核用户评论内容，" + userComment.getUserName());
    }
}
