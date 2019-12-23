package cn.wyq.sentimentanalysis.entity.pojo;

import lombok.Data;

@Data
public class BookEmotion {
    private Integer id;

    private Integer bookId;

    private Integer commentCount;

    private Integer posCommentCount;

    private Integer negCommentCount;

    /**
     * 概述的总体情感倾向，计算方式为正面情绪/负面情绪
     */
    private Double emotionRate;
    // 书籍信息
    private Book book;
}