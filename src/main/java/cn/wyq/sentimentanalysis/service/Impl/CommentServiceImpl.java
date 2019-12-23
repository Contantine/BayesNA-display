package cn.wyq.sentimentanalysis.service.Impl;
import java.util.List;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import cn.wyq.sentimentanalysis.entity.pojo.Comment;
import cn.wyq.sentimentanalysis.mapper.CommentMapper;
import cn.wyq.sentimentanalysis.service.CommentService;
@Service
public class CommentServiceImpl implements CommentService{

    @Resource
    private CommentMapper commentMapper;

    @Override
    public int deleteByPrimaryKey(Integer commentId) {
        return commentMapper.deleteByPrimaryKey(commentId);
    }

    @Override
    public int insert(Comment record) {
        return commentMapper.insert(record);
    }

    @Override
    public int insertSelective(Comment record) {
        return commentMapper.insertSelective(record);
    }

    @Override
    public Comment selectByPrimaryKey(Integer commentId) {
        return commentMapper.selectByPrimaryKey(commentId);
    }

    @Override
    public int updateByPrimaryKeySelective(Comment record) {
        return commentMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Comment record) {
        return commentMapper.updateByPrimaryKey(record);
    }

	@Override
	public Integer countByCommentEmotion(Integer commentEmotion){
		 return commentMapper.countByCommentEmotion(commentEmotion);
	}

	@Override
	public Integer countByCommentEmotionAndBookId(Integer commentEmotion,Integer bookId){
		 return commentMapper.countByCommentEmotionAndBookId(commentEmotion,bookId);
	}

    @Override
    public PageInfo<Comment> selectByBookId(int page, int size, int bookId, int emotion, String order) {
        PageHelper.startPage(page,size);
        List<Comment> comList = commentMapper.selectAllByBookId(bookId,emotion,order);
        return new PageInfo<>(comList);
    }


}
