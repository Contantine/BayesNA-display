package cn.wyq.sentimentanalysis.service;
import java.util.List;

import cn.wyq.sentimentanalysis.entity.pojo.Comment;
import com.github.pagehelper.PageInfo;

public interface CommentService{


    int deleteByPrimaryKey(Integer commentId);

    int insert(Comment record);

    int insertSelective(Comment record);

    Comment selectByPrimaryKey(Integer commentId);

    int updateByPrimaryKeySelective(Comment record);

    int updateByPrimaryKey(Comment record);

    /**
     * 根据情感倾向查询评论数量
     * @param commentEmotion 情感倾向
     * @return 评论数量
     */
	Integer countByCommentEmotion(Integer commentEmotion);

    /**
     * 根据情感倾向和书籍编号查询评论数量
     * @param commentEmotion 情感倾向
     * @param bookId 书籍编号
     * @return 评论数量
     */
	Integer countByCommentEmotionAndBookId(Integer commentEmotion,Integer bookId);


    /**
     * 根据书籍编号获得评论信息
     * @param page 页码
     * @param size 一页显示的数量
     * @param bookId 书籍编号
     * @param emotion  情感倾向
     * @param order 情感值
     * @return
     */
	PageInfo<Comment> selectByBookId(int page, int size, int bookId, int emotion, String order);

}
