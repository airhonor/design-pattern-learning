package com.hz.design.pattern.factory.method.MyFactory;

import com.hz.design.pattern.factory.method.entity.CommonComment;

/**
 * @program: design-pattern-learning
 * @author: zgr
 * @create: 2021-09-10 10:40
 **/
public interface CommentFactory {

    /**
     * 创建评论对象实例
     *
     * @return 评论对象实例
     */
    CommonComment createComment();
}
