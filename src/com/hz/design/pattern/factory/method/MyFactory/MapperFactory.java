package com.hz.design.pattern.factory.method.MyFactory;

import com.hz.design.pattern.factory.method.mapper.Mapper;

/**
 * @program: design-pattern-learning
 * @author: zgr
 * @create: 2021-09-10 10:31
 **/
public interface MapperFactory {

    /**
     * 创建mapper实例
     *
     * @return mapper实例
     */
    Mapper createMapper();
}
