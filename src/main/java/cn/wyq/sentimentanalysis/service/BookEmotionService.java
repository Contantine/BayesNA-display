package cn.wyq.sentimentanalysis.service;
import java.util.List;

import cn.wyq.sentimentanalysis.entity.pojo.BookEmotion;
import com.github.pagehelper.PageInfo;

public interface BookEmotionService{


    int deleteByPrimaryKey(Integer id);

    int insert(BookEmotion record);

    int insertSelective(BookEmotion record);

    BookEmotion selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(BookEmotion record);

    int updateByPrimaryKey(BookEmotion record);

    /**
     * 返回书籍情感倾向数据和书籍数据
     * @return
     */
    PageInfo<BookEmotion> selectAll(int page, int size,String param,String order);

    /**
     * 根据书籍Id返回书籍评论情感信息
     * @param bookId 书籍编号
     * @return
     */
    BookEmotion selectAllByBookId(int bookId);
}
