package com.hz.design.pattern.abstracted.factory.mapper;

/**
 * @program: design-pattern-learning
 * @author: zgr
 * @create: 2021-09-01 16:24
 **/
public interface Mapper<T> {

    /**
     * 存储实体到数据库
     *
     * @param entity 存储的实体
     */
    void saveEntity(T entity);
}
