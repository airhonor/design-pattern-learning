package com.hz.design.pattern.factory.method.mapper;


import com.hz.design.pattern.factory.method.entity.MerchantComment;

/**
 * @program: design-pattern-learning
 * @author: zgr
 * @create: 2021-09-01 16:26
 **/
public class MerchantCommentMapper implements Mapper<MerchantComment> {

    @Override
    public void saveEntity(MerchantComment merchantComment) {
        System.out.println("存储的是审核商户回复内容，" + merchantComment.getMerchantName());
    }
}
