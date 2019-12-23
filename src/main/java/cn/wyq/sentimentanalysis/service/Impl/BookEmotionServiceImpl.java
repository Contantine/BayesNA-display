package cn.wyq.sentimentanalysis.service.Impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import cn.wyq.sentimentanalysis.entity.pojo.BookEmotion;
import cn.wyq.sentimentanalysis.mapper.BookEmotionMapper;
import cn.wyq.sentimentanalysis.service.BookEmotionService;

import java.util.List;

@Service
public class BookEmotionServiceImpl implements BookEmotionService{

    @Resource
    private BookEmotionMapper bookEmotionMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return bookEmotionMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(BookEmotion record) {
        return bookEmotionMapper.insert(record);
    }

    @Override
    public int insertSelective(BookEmotion record) {
        return bookEmotionMapper.insertSelective(record);
    }

    @Override
    public BookEmotion selectByPrimaryKey(Integer id) {
        return bookEmotionMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(BookEmotion record) {
        return bookEmotionMapper.updateByPrimaryKeySelective(record);
    }
    @Override
    public int updateByPrimaryKey(BookEmotion record) {
        return bookEmotionMapper.updateByPrimaryKey(record);
    }

    @Override
    public PageInfo<BookEmotion> selectAll(int page,int size,String param,String order){
        PageHelper.startPage(page,size);
        List<BookEmotion> bookEmotions = bookEmotionMapper.selectAll(param,order);
        PageInfo<BookEmotion> pageInfo = new PageInfo<>(bookEmotions);
        return pageInfo;
    }

    @Override
    public BookEmotion selectAllByBookId(int bookId) {
        return bookEmotionMapper.selectAllByBookId(bookId);
    }
}
