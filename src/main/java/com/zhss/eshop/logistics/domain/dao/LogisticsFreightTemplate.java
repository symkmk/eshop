package com.zhss.eshop.logistics.domain.dao;

import java.util.Date;
import lombok.Data;

/**
    * 物流中心的运费模板表
    */
@Data
public class LogisticsFreightTemplate {
    /**
    * 主键
    */
    private Long id;

    /**
    * 运费模板名称
    */
    private String name;

    /**
    * 运费模板类型，1：固定运费，2：满X元包邮，3：自定义规则
    */
    private Byte type;

    /**
    * 运费模板的规则
    */
    private String rule;

    /**
    * 运费模板的说明备注
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