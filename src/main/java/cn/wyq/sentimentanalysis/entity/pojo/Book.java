package cn.wyq.sentimentanalysis.entity.pojo;

import lombok.Data;

@Data
public class Book {
    private Integer bookId;

    private String bookName;

    private String author;

    private Integer commentPeopleNum;

    private String bookUrl;

    private String bookImage;

    private Integer status;
}