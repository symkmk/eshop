package com.zhss.eshop.commodity.domain.dto;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
    * 商品中心的商品信息基础表
    */
@Data
public class GoodsDTO {
    /**
    * 主键
    */
    private Long id;

    /**
    * 类目ID
    */
    private Long categoryId;

    /**
    * 品牌ID
    */
    private Long brandId;

    /**
    * SPU编号
    */
    private String code;

    /**
    * 商品名称
    */
    private String name;

    /**
    * 商品副名称
    */
    private String subName;

    /**
    * 商品毛重，单位是g
    */
    private BigDecimal grossWeight;

    /**
    * 外包装长度，单位是cm
    */
    private BigDecimal length;

    /**
    * 外包装宽，单位是cm
    */
    private BigDecimal width;

    /**
    * 外包装高，单位是cm
    */
    private BigDecimal height;

    /**
    * 商品状态，1：待审核，2：待上架，3：审核未通过，4：已上架
    */
    private Byte status;

    /**
    * 服务保证
    */
    private String serviceGuarantees;

    /**
    * 包装清单
    */
    private String packageList;

    /**
    * 运费模板ID
    */
    private Long freightTemplateId;

    /**
    * 创建时间
    */
    private Date gmtCreate;

    /**
    * 更新时间
    */
    private Date gmtModified;
}
