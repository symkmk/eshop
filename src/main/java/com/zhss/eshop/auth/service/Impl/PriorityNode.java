package com.zhss.eshop.auth.service.Impl;

import com.zhss.eshop.common.util.BeanCopierUtils;
import lombok.Data;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
    * 权限表，每个权限代表了系统中的一个菜单、按钮、URL请求
    */
@Data
public class PriorityNode {

    private static final Logger logger = LoggerFactory.getLogger(
            PriorityNode.class);

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

    /**
     * 子权限节点(拼装成一个树结构)
     */
    private List<PriorityNode> children = new ArrayList<PriorityNode>();

    public void accept(PriorityOperation visitor) throws Exception{
        visitor.visit(this);
    }
}
