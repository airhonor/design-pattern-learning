package com.hz.design.pattern.factory.method.MyFactory;

import com.hz.design.pattern.factory.method.mapper.Mapper;
import com.hz.design.pattern.factory.method.mapper.MerchantCommentMapper;

/**
 * @program: design-pattern-learning
 * @author: zgr
 * @create: 2021-09-10 10:34
 **/
public class MerchantCommentMapperFactory implements MapperFactory {

    @Override
    public Mapper createMapper() {
        return new MerchantCommentMapper();
    }
}
