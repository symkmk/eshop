package com.zhss.eshop.commodity.domain.model;

import java.util.Date;
import lombok.Data;

/**
    * 商品中心的品牌表
    */
@Data
public class CommodityBrand {
    /**
    * 主键
    */
    private Long id;

    /**
    * 品牌中文名
    */
    private String chineseName;

    /**
    * 品牌英文名
    */
    private String englishName;

    /**
    * 品牌别名
    */
    private String aliasName;

    /**
    * logo的图片路径
    */
    private String logoPath;

    /**
    * 品牌介绍
    */
    private String introduction;

    /**
    * 品牌授权凭证的图片路径
    */
    private String authVoucherPath;

    /**
    * 品牌所在地
    */
    private String location;

    /**
    * 品牌说明备注
    */
    private String remark;

    /**
    * 创建时间
    */
    private Date gmtCreate;

    /**
    * 更新时间
    */
    private Date gmtModified;
}
