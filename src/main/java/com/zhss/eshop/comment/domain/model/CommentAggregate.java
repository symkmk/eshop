package com.zhss.eshop.comment.domain.model;

import java.math.BigDecimal;
import java.util.Date;

import com.zhss.eshop.common.util.BeanCopierUtils;
import lombok.Data;

/**
    * 评论聚合汇总表
    */
@Data
public class CommentAggregate {
    /**
    * 主键
    */
    private Long id;

    /**
    * 商品ID
    */
    private Long goodsId;

    /**
    * 评论总数量
    */
    private Long totalCommentCount;

    /**
    * 好评数量
    */
    private Long goodCommentCount;

    /**
    * 好评率
    */
    private Double goodCommentRate;

    /**
    * 晒图评论数量
    */
    private Long showPicturesCommentCount;

    /**
    * 中评数量
    */
    private Long mediumCommentCount;

    /**
    * 差评数量
    */
    private Long badCommentCount;

    /**
    * 创建时间
    */
    private Date gmtCreate;

    /**
    * 更新时间
    */
    private Date gmtModified;

    //克隆
    public <T> T clone(Class<T> clazz) throws Exception {
        T target=null;
        try {
            target=clazz.newInstance();
        }catch (Exception exception){
//            logger.error("克隆对象出错");
        }
        BeanCopierUtils.copyProperties(this, target);
        return target;

    }
}
