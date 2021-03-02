package com.zhss.eshop.comment.service.Impl;

import com.zhss.eshop.comment.constant.CommentInfoScore;
import com.zhss.eshop.comment.constant.CommentStatus;
import com.zhss.eshop.comment.constant.CommentType;
import com.zhss.eshop.comment.constant.DefaultComment;
import com.zhss.eshop.comment.domain.dto.CommentInfoDTO;
import com.zhss.eshop.comment.domain.model.CommentInfo;
import com.zhss.eshop.comment.mapper.CommentInfoMapper;
import com.zhss.eshop.comment.service.CommentInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.Date;

@Service
public class CommentInfoServiceImpl implements CommentInfoService{

    @Resource
    private CommentInfoMapper commentInfoMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return commentInfoMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insertSelective(CommentInfo record) {
        return commentInfoMapper.insertSelective(record);
    }

    @Override
    public CommentInfo selectByPrimaryKey(Long id) {
        return commentInfoMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(CommentInfo record) {
        return commentInfoMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public void saveManualPublishedCommentInfo(CommentInfoDTO commentInfoDTO) throws Exception {
        // 计算评论的总分数
        Integer totalScore = Math.round((commentInfoDTO.getGoodsScore()
                + commentInfoDTO.getCustomerServiceScore()
                + commentInfoDTO.getLogisticsScore()) / 3);
        commentInfoDTO.setTotalScore(totalScore);

        // 设置是否为默认评论
        commentInfoDTO.setIsDefaultComment(DefaultComment.NO);

        // 设置评论的状态
        commentInfoDTO.setCommentStatus(CommentStatus.APPROVING);

        // 设置评论的类型
        Integer commentType = 0;
        if(totalScore >= CommentInfoScore.FOUR) {
            commentType = CommentType.GOOD_COMMENT;
        } else if(totalScore == CommentInfoScore.THREE) {
            commentType = CommentType.MEDIUM_COMMENT;
        } else if(totalScore > CommentInfoScore.ZERO && totalScore <= CommentInfoScore.TWO) {
            commentType = CommentType.BAD_COMMENT;
        }

        commentInfoDTO.setCommentType(commentType);

        // 设置创建时间和修改时间
        SimpleDateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        commentInfoDTO.setGmtCreate(dateFormatter.parse(dateFormatter.format(new Date())));
        commentInfoDTO.setGmtModified(dateFormatter.parse(dateFormatter.format(new Date())));

        // 将评论信息保存到数据库中去
        CommentInfo commentInfoDO = commentInfoDTO.clone(CommentInfo.class);
        commentInfoMapper.insertSelective(commentInfoDO);

        // 设置评论信息的id
        commentInfoDTO.setId(commentInfoDO.getId());
    }

}
