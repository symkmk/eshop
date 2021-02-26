package com.zhss.eshop.commodity.domain.model;

import java.util.Date;
import lombok.Data;

/**
    * 商品附加的图片表
    */
@Data
public class CommodityGoodsPicture {
    /**
    * 主键
    */
    private Long id;

    /**
    * 商品ID
    */
    private Long goodsId;

    /**
    * 图片路径
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
