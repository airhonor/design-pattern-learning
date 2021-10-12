package com.hz.design.pattern.abstracted.factory;

import com.hz.design.pattern.abstracted.factory.entity.CommonComment;
import com.hz.design.pattern.abstracted.factory.entity.MerchantComment;
import com.hz.design.pattern.abstracted.factory.mapper.Mapper;
import com.hz.design.pattern.abstracted.factory.mapper.MerchantCommentMapper;

/**
 * @program: design-pattern-learning
 * @author: zgr
 * @create: 2021-09-29 11:08
 **/
public class MerchantCommentConcreteFactory implements MyAbstractFactory {

    @Override
    public Mapper createMapperInstance() {
        return new MerchantCommentMapper();
    }

    @Override
    public CommonComment createCommentInstance() {
        MerchantComment merchantComment = new MerchantComment();
        merchantComment.setId(1);
        merchantComment.setCommentContent("商户评论类容");
        merchantComment.setCommentResult("商户评论审核结果");
        merchantComment.setMerchantName("hello，我是商户评论");
        return merchantComment;
    }
}
