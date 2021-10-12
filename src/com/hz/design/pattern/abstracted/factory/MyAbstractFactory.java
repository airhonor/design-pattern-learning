package com.hz.design.pattern.abstracted.factory;

import com.hz.design.pattern.abstracted.factory.entity.CommonComment;
import com.hz.design.pattern.abstracted.factory.mapper.Mapper;

/**
 * @program: design-pattern-learning
 * @author: zgr
 * @create: 2021-09-28 11:37
 **/
public interface MyAbstractFactory {
    /**
     * 创建mapper实例
     *
     * @return mapper实例
     */
    Mapper createMapperInstance();

    /**
     * 创建评论实例
     *
     * @return 评论实例
     */
    CommonComment createCommentInstance();

}
