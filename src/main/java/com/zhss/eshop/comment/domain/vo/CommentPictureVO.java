package com.zhss.eshop.comment.domain.vo;

import com.zhss.eshop.common.util.BeanCopierUtils;
import lombok.Data;

import java.util.Date;

/**
    * 评论的晒图
    */
@Data
public class CommentPictureVO {
    /**
    * 主键
    */
    private Long id;

    /**
    * 评论ID
    */
    private Long commentInfoId;

    /**
    * 评论晒图的图片路径
    */
    private String commentPicturePath;

    /**
    * 创建时间
    */
    private Date gmtCreate;

    /**
    * 更新时间
    */
    private Date gmtModified;

    //克隆
    public <T> T clone(Class<T> clazz) throws Exception {
        T target=null;
        try {
            target=clazz.newInstance();
        }catch (Exception exception){
//            logger.error("克隆对象出错");
        }
        BeanCopierUtils.copyProperties(this, target);
        return target;

    }
}
