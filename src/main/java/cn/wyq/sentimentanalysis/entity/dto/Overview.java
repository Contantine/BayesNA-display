package cn.wyq.sentimentanalysis.entity.dto;

import cn.wyq.sentimentanalysis.entity.pojo.Comment;
import lombok.Data;

import java.util.List;

@Data
public class Overview {
    // 书籍编号，值为-1时代表时所有书籍
    private int bookId;
    // 若书籍编号为-1时的书籍数量
    private int bookCount;
    // 正面情绪评论数量
    private int posCount;
    // 负面情绪评论数量
    private int negCount;
    // 评论合集
    private List<Comment> comments;

    public Overview(){}


    public Overview(int bookId,int bookCount,int posCount,int negCount,List<Comment> comments){
        this.bookId = bookId;
        this.bookCount = bookCount;
        this.posCount = posCount;
        this.negCount = negCount;
        this.comments = comments;
    }
}
