package cn.wyq.sentimentanalysis.entity.dto;

import cn.wyq.sentimentanalysis.entity.pojo.BookEmotion;
import lombok.Data;

@Data
public class BookListDisplay {
    // 书籍编号
    private int bookId;
    // 书籍名
    private String bookName;
    // 书籍地址
    private String bookUrl;
    // 书籍评论数量
    private int commentCount;
    // 书籍正面倾向评论数量
    private int posCommentCount;
    // 书籍负面倾向评论数量
    private int negCommentCount;
    // 书籍情绪倾向率
    private Double emotionRate;

    public BookListDisplay(BookEmotion bookEmotion){
        this.bookId = bookEmotion.getBookId();
        this.bookName = bookEmotion.getBook().getBookName();
        this.bookUrl = bookEmotion.getBook().getBookUrl();
        this.commentCount = bookEmotion.getCommentCount();
        this.posCommentCount = bookEmotion.getPosCommentCount();
        this.negCommentCount = bookEmotion.getNegCommentCount();
        this.emotionRate = bookEmotion.getEmotionRate();
    }
}
