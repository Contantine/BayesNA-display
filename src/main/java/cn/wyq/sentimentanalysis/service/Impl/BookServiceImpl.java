package cn.wyq.sentimentanalysis.service.Impl;
import cn.wyq.sentimentanalysis.entity.pojo.BookEmotion;
import java.util.List;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import cn.wyq.sentimentanalysis.mapper.BookMapper;
import cn.wyq.sentimentanalysis.entity.pojo.Book;
import cn.wyq.sentimentanalysis.service.BookService;

@Service
public class BookServiceImpl implements BookService {

    @Resource
    private BookMapper bookMapper;
    @org.springframework.beans.factory.annotation.Autowired
    private cn.wyq.sentimentanalysis.mapper.BookEmotionMapper bookEmotionMapper;

    @Override
    public int deleteByPrimaryKey(Integer bookId) {
        return bookMapper.deleteByPrimaryKey(bookId);
    }

    @Override
    public int insert(Book record) {
        return bookMapper.insert(record);
    }

    @Override
    public int insertSelective(Book record) {
        return bookMapper.insertSelective(record);
    }

    @Override
    public Book selectByPrimaryKey(Integer bookId) {
        return bookMapper.selectByPrimaryKey(bookId);
    }

    @Override
    public int updateByPrimaryKeySelective(Book record) {
        return bookMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Book record) {
        return bookMapper.updateByPrimaryKey(record);
    }

    @Override
    public Integer countBookId() {
        return bookMapper.countBookId();
    }





}

