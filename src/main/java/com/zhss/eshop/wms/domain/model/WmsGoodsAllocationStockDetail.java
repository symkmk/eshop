package com.zhss.eshop.wms.domain.model;

import java.util.Date;
import lombok.Data;

@Data
public class WmsGoodsAllocationStockDetail {
    /**
    * 主键
    */
    private Long id;

    /**
    * 商品sku id
    */
    private Long goodsSkuId;

    /**
    * 货位id
    */
    private Long goodsAllocationId;

    /**
    * 上架时间
    */
    private Date putOnTime;

    /**
    * 上架多少件商品
    */
    private Long putOnQuantity;

    /**
    * 当前这一批上架的商品还有多少件库存
    */
    private Long currentStockQuantity;

    /**
    * 当前这一批商品被锁定的库存
    */
    private Long lockedStockQuantity;

    /**
    * 创建时间
    */
    private Date gmtCreate;

    /**
    * 修改时间
    */
    private Date gmtModified;
}
