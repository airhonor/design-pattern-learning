package com.hz.design.pattern.factory.method.MyFactory;

import com.hz.design.pattern.factory.method.entity.CommonComment;
import com.hz.design.pattern.factory.method.entity.MerchantComment;

/**
 * @program: design-pattern-learning
 * @author: zgr
 * @create: 2021-09-10 10:42
 **/
public class MerchantCommentFactory implements CommentFactory {
    @Override
    public CommonComment createComment() {
        MerchantComment merchantComment = new MerchantComment();
        merchantComment.setId(1);
        merchantComment.setCommentContent("商户评论类容");
        merchantComment.setCommentResult("商户评论审核结果");
        merchantComment.setMerchantName("hello，我是商户评论");
        return merchantComment;
    }
}
