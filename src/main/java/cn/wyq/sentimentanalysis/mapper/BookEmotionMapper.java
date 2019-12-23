package cn.wyq.sentimentanalysis.mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

import cn.wyq.sentimentanalysis.entity.pojo.BookEmotion;

public interface BookEmotionMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(BookEmotion record);

    int insertSelective(BookEmotion record);

    BookEmotion selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(BookEmotion record);

    int updateByPrimaryKey(BookEmotion record);

    List<BookEmotion> selectAll(@Param("columnName") String column, @Param("order") String order);

    BookEmotion selectAllByBookId(@Param("bookId")int bookId);

}