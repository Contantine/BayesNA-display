package cn.wyq.sentimentanalysis.service;

import cn.wyq.sentimentanalysis.entity.pojo.Book;

public interface BookService {


    int deleteByPrimaryKey(Integer bookId);

    int insert(Book record);

    int insertSelective(Book record);

    Book selectByPrimaryKey(Integer bookId);

    int updateByPrimaryKeySelective(Book record);

    int updateByPrimaryKey(Book record);

    /**
     * 获得书籍数量
     *
     * @return 书籍数量
     */
    Integer countBookId();
}

