package com.zhss.eshop.comment.domain.model;

import java.util.Date;
import lombok.Data;

/**
    * 评论信息表
    */
@Data
public class CommentInfo {
    /**
    * 主键
    */
    private Long id;

    /**
    * 发表评论的用户账号的ID
    */
    private Long userAccountId;

    /**
    * 用户名
    */
    private String username;

    /**
    * 订单信息ID
    */
    private Long orderInfoId;

    /**
    * 订单条目id
    */
    private Long orderItemId;

    /**
    * 商品ID
    */
    private Long goodsId;

    /**
    * 商品sku ID
    */
    private Long goodsSkuId;

    /**
    * 商品sku的销售属性
    */
    private String goodsSkuSaleProperties;

    /**
    * 总评分，1~5
    */
    private Byte totalScore;

    /**
    * 商品评分，1~5
    */
    private Byte goodsScore;

    /**
    * 客服评分，1~5
    */
    private Byte customerServiceScore;

    /**
    * 物流评分，1~5
    */
    private Byte logisticsScore;

    /**
    * 评论内容
    */
    private String commentContent;

    /**
    * 是否晒图，1：晒图，0：未晒图
    */
    private Byte isShowPictures;

    /**
    * 是否系统自动给的默认评论，1：是默认评论，0：不是默认评论
    */
    private Byte isDefaultComment;

    /**
    * 评论状态，1：待审核，2：已审核，3：审核不通过
    */
    private Byte commentStatus;

    /**
    * 评论类型，1：好评，总分是4分以上；2：中评，3分；3：差评，1~2分
    */
    private Byte commentType;

    /**
    * 创建时间
    */
    private Date gmtCreate;

    /**
    * 更新时间
    */
    private Date gmtModified;
}
