package com.zhss.eshop.wms.domain.model;

import java.util.Date;
import lombok.Data;

/**
    * 退货入库单条目关联的上架条目
    */
@Data
public class WmsReturnGoodsInputOrderPutOnItem {
    /**
    * 主键
    */
    private Long id;

    /**
    * 退货入库单条目ID
    */
    private Long returnGoodsInputOrderItemId;

    /**
    * 货位ID
    */
    private Long goodsAllocationId;

    /**
    * 商品sku id
    */
    private Long goodsSkuId;

    /**
    * 上架数量
    */
    private Long putOnShelvesCount;

    /**
    * 创建时间
    */
    private Date gmtCreate;

    /**
    * 更新时间
    */
    private Date gmtModified;
}
