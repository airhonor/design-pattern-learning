package com.hz.design.pattern.factory.method.MyFactory;

import com.hz.design.pattern.factory.method.entity.CommonComment;
import com.hz.design.pattern.factory.method.entity.UserComment;

/**
 * @program: design-pattern-learning
 * @author: zgr
 * @create: 2021-09-10 10:42
 **/
public class UserCommentFactory implements CommentFactory {
    @Override
    public CommonComment createComment() {
        UserComment userComment = new UserComment();
        userComment.setId(1);
        userComment.setCommentContent("用户评论类容");
        userComment.setCommentResult("用户评论审核结果");
        userComment.setUserName("hello，我是用户评论");
        return userComment;
    }
}
