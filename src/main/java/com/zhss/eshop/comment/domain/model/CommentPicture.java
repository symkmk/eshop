package com.zhss.eshop.comment.domain.model;

import java.util.Date;
import lombok.Data;

/**
    * 评论的晒图
    */
@Data
public class CommentPicture {
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
}
