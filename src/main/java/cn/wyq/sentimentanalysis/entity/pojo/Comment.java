package cn.wyq.sentimentanalysis.entity.pojo;

import lombok.Data;

@Data
public class Comment {
    private Integer commentId;

    private String commentContent;

    private Integer commentEmotion;

    private Double commentEmotionValue;

    private Integer bookId;
}