package com.zhss.eshop.auth.domain.vo;

import com.zhss.eshop.auth.domain.dto.PriorityDTO;
import com.zhss.eshop.common.util.BeanCopierUtils;
import lombok.Data;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Date;

/**
    * 权限表，每个权限代表了系统中的一个菜单、按钮、URL请求
    */
@Data
public class PriorityVO {

    private static final Logger logger = LoggerFactory.getLogger(PriorityVO.class);
    /**
    * 主键，自增长
    */
    private Long id;

    /**
    * 权限编号
    */
    private String code;

    /**
    * 权限对应的请求URL
    */
    private String url;

    /**
    * 权限的说明备注
    */
    private String priorityComment;

    /**
    * 权限类型，1：菜单，2：其他
    */
    private Byte priorityType;

    /**
    * 父权限的主键
    */
    private Long parentId;

    /**
    * 权限的创建时间
    */
    private Date gmtCreate;

    /**
    * 权限的修改时间
    */
    private Date gmtModified;

    //克隆
    public <T> T clone(Class<T> clazz) throws Exception {
        T target=null;
        try {
            target=clazz.newInstance();
        }catch (Exception exception){
            logger.error("克隆对象出错");
        }
        BeanCopierUtils.copyProperties(this, target);
        return target;

    }
}
