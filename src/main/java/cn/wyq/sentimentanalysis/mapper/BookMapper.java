package cn.wyq.sentimentanalysis.mapper;

import cn.wyq.sentimentanalysis.entity.pojo.Book;import java.util.List;

public interface BookMapper {
    int deleteByPrimaryKey(Integer bookId);

    int insert(Book record);

    int insertSelective(Book record);

    Book selectByPrimaryKey(Integer bookId);

    int updateByPrimaryKeySelective(Book record);

    int updateByPrimaryKey(Book record);

    List<Book> selectOrderByBookId();

    Integer countBookId();
}