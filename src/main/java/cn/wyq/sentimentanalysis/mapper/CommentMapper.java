package cn.wyq.sentimentanalysis.mapper;
import org.apache.ibatis.annotations.Param;

import cn.wyq.sentimentanalysis.entity.pojo.Comment;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CommentMapper {
    int deleteByPrimaryKey(Integer commentId);

    int insert(Comment record);

    int insertSelective(Comment record);

    Comment selectByPrimaryKey(Integer commentId);

    int updateByPrimaryKeySelective(Comment record);

    int updateByPrimaryKey(Comment record);

    Integer countByCommentEmotion(@Param("commentEmotion")Integer commentEmotion);

    Integer countByCommentEmotionAndBookId(@Param("commentEmotion")Integer commentEmotion,@Param("bookId")Integer bookId);

    List<Comment> selectAllByBookId(@Param("bookId") int bookId,@Param("emotion")int emotion,
                                    @Param("order") String order);


}