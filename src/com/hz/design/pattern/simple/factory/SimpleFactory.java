package com.hz.design.pattern.simple.factory;

import com.hz.design.pattern.simple.factory.entity.CommonComment;
import com.hz.design.pattern.simple.factory.entity.MerchantComment;
import com.hz.design.pattern.simple.factory.entity.UserComment;
import com.hz.design.pattern.simple.factory.mapper.Mapper;
import com.hz.design.pattern.simple.factory.mapper.MerchantCommentMapper;
import com.hz.design.pattern.simple.factory.mapper.UserCommentMapper;

/**
 * @program: design-pattern-learning
 * @author: zgr
 * @create: 2021-09-01 16:38
 **/
public class SimpleFactory {

    public static Mapper createMapper(String identity) {
        Mapper mapper = null;
        switch (identity) {
            case "merchant":
                mapper = new MerchantCommentMapper();
                break;
            case "user":
                mapper = new UserCommentMapper();
                break;
            default:
        }
        return mapper;
    }

    public static CommonComment createCommentEntity(String identity, CommonComment commonComment) {
        CommonComment comment = null;
        switch (identity) {
            case "merchant":
                MerchantComment merchantComment = new MerchantComment();
                merchantComment.setId(commonComment.getId());
                merchantComment.setCommentContent(commonComment.getCommentContent());
                merchantComment.setCommentResult(commonComment.getCommentResult());
                merchantComment.setMerchantName("hello，我是商户评论回复");
                comment = merchantComment;
                break;
            case "user":
                UserComment userComment = new UserComment();
                userComment.setId(commonComment.getId());
                userComment.setCommentContent(commonComment.getCommentContent());
                userComment.setCommentResult(commonComment.getCommentResult());
                userComment.setUserName("hello，我是用户评论");
                comment = userComment;
                break;
            default:
        }
        return comment;
    }
}
