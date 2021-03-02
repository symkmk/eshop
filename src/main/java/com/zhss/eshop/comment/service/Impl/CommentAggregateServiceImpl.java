package com.zhss.eshop.comment.service.Impl;

import com.zhss.eshop.comment.constant.CommentType;
import com.zhss.eshop.comment.constant.ShowPictures;
import com.zhss.eshop.comment.domain.dto.CommentAggregateDTO;
import com.zhss.eshop.comment.domain.dto.CommentInfoDTO;
import com.zhss.eshop.comment.domain.model.CommentAggregate;
import com.zhss.eshop.comment.mapper.CommentAggregateMapper;
import com.zhss.eshop.comment.service.CommentAggregateService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

@Service
public class CommentAggregateServiceImpl implements CommentAggregateService{

    @Resource
    private CommentAggregateMapper commentAggregateMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return commentAggregateMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insertSelective(CommentAggregate record) {
        return commentAggregateMapper.insertSelective(record);
    }

    @Override
    public CommentAggregate selectByPrimaryKey(Long id) {
        return commentAggregateMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(CommentAggregate record) {
        return commentAggregateMapper.updateByPrimaryKeySelective(record);
    }

    /**
     * 更新评论统计信息
     * @param commentInfoDTO 评论信息
     * @return 处理结果
     */
    @Override
    public CommentAggregateDTO refreshCommentAggregate(CommentInfoDTO commentInfoDTO) throws Exception {
        CommentAggregate commentAggregateDO = commentAggregateMapper.getCommentAggregateByGoodsId(
                commentInfoDTO.getGoodsId());
        if(commentAggregateDO == null) {
            commentAggregateDO = saveCommentAggregate(commentInfoDTO);
        } else {
            updateCommentAggregate(commentInfoDTO, commentAggregateDO);
        }
        return commentAggregateDO.clone(CommentAggregateDTO.class);
    }

    /**
     * 新增评论统计信息
     * @param commentInfoDTO
     */
    private CommentAggregate saveCommentAggregate(
            CommentInfoDTO commentInfoDTO) throws Exception {
        CommentAggregate commentAggregateDO = new CommentAggregate();

        commentAggregateDO.setGoodsId(commentInfoDTO.getGoodsId());
        commentAggregateDO.setTotalCommentCount(1L);
        commentAggregateDO.setGoodCommentCount(0L);
        commentAggregateDO.setMediumCommentCount(0L);
        commentAggregateDO.setBadCommentCount(0L);

        if(commentInfoDTO.getCommentType().equals(CommentType.GOOD_COMMENT)) {
            commentAggregateDO.setGoodCommentCount(1L);
        } else if(commentInfoDTO.getCommentType().equals(CommentType.MEDIUM_COMMENT)) {
            commentAggregateDO.setMediumCommentCount(1L);
        } else if(commentInfoDTO.getCommentType().equals(CommentType.BAD_COMMENT)) {
            commentAggregateDO.setBadCommentCount(1L);
        }

        Double goodCommentRate = Double.valueOf(new DecimalFormat("#.00").format(
                (double)commentAggregateDO.getGoodCommentCount() / (double)commentAggregateDO.getTotalCommentCount()));
        commentAggregateDO.setGoodCommentRate(goodCommentRate);

        if(ShowPictures.YES.equals(commentInfoDTO.getIsShowPictures())) {
            commentAggregateDO.setShowPicturesCommentCount(1L);
        }
        SimpleDateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        commentAggregateDO.setGmtCreate(dateFormatter.parse(dateFormatter.format(new Date())));
        commentAggregateDO.setGmtModified(dateFormatter.parse(dateFormatter.format(new Date())));

        commentAggregateMapper.insertSelective(commentAggregateDO);

        return commentAggregateDO;
    }

    /**
     * 更新评论统计信息
     * @param commentInfoDTO
     * @param commentAggregateDO
     */
    private void updateCommentAggregate(CommentInfoDTO commentInfoDTO,
                                        CommentAggregate commentAggregateDO) throws Exception {
        commentAggregateDO.setTotalCommentCount(commentAggregateDO.getTotalCommentCount() + 1L);

        if(commentInfoDTO.getCommentType().equals(CommentType.GOOD_COMMENT)) {
            commentAggregateDO.setGoodCommentCount(commentAggregateDO.getGoodCommentCount() + 1L);
        } else if(commentInfoDTO.getCommentType().equals(CommentType.MEDIUM_COMMENT)) {
            commentAggregateDO.setMediumCommentCount(commentAggregateDO.getMediumCommentCount() + 1L);
        } else if(commentInfoDTO.getCommentType().equals(CommentType.BAD_COMMENT)) {
            commentAggregateDO.setBadCommentCount(commentAggregateDO.getBadCommentCount() + 1L);
        }

        Double goodCommentRate = Double.valueOf(new DecimalFormat("#.00").format(
                (double)commentAggregateDO.getGoodCommentCount() / (double)commentAggregateDO.getTotalCommentCount()));
        commentAggregateDO.setGoodCommentRate(goodCommentRate);

        if(ShowPictures.YES.equals(commentInfoDTO.getIsShowPictures())) {
            commentAggregateDO.setShowPicturesCommentCount(
                    commentAggregateDO.getShowPicturesCommentCount() + 1L);
        }
        SimpleDateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        commentAggregateDO.setGmtModified(dateFormatter.parse(dateFormatter.format(new Date())));

        commentAggregateMapper.updateByPrimaryKeySelective(commentAggregateDO);
    }
}
