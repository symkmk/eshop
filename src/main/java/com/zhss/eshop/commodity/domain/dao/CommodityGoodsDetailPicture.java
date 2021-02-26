package com.zhss.eshop.commodity.domain.dao;

import java.util.Date;
import lombok.Data;

/**
    * 商品详情内容中的图片
    */
@Data
public class CommodityGoodsDetailPicture {
    /**
    * 主键
    */
    private Long id;

    /**
    * 商品详情id
    */
    private Long goodsDetailId;

    /**
    * 商品详情内容中的一张图片的路径
    */
    private String picturePath;

    /**
    * 创建时间
    */
    private Date gmtCreate;

    /**
    * 更新时间
    */
    private Date gmtModified;
}