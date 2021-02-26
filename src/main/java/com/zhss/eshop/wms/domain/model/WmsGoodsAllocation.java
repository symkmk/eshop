package com.zhss.eshop.wms.domain.model;

import java.util.Date;
import lombok.Data;

/**
    * WMS中心的货位表
    */
@Data
public class WmsGoodsAllocation {
    /**
    * 主键
    */
    private Long id;

    /**
    * 货位编号
    */
    private String code;

    /**
    * 说明备注
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
