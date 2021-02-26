package com.zhss.eshop.inventory.domain.dao;

import java.util.Date;
import lombok.Data;

@Data
public class InventoryOfflineStockUpdateMessage {
    /**
    * 主键
    */
    private byte[] id;

    /**
    * 库存更新消息id
    */
    private String messageId;

    /**
    * 库存更新操作类型
    */
    private Boolean operation;

    /**
    * 参数，json格式
    */
    private String parameter;

    /**
    * 参数类型
    */
    private String parameterClazz;

    /**
    * 创建时间
    */
    private Date gmtCreate;

    /**
    * 修改时间
    */
    private Date gmtModified;
}