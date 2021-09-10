package com.hz.design.pattern.factory.method.MyFactory;

import com.hz.design.pattern.factory.method.mapper.Mapper;
import com.hz.design.pattern.factory.method.mapper.UserCommentMapper;

/**
 * @program: design-pattern-learning
 * @author: zgr
 * @create: 2021-09-10 10:36
 **/
public class UserCommentMapperFactory implements MapperFactory {
    @Override
    public Mapper createMapper() {
        return new UserCommentMapper();
    }
}
