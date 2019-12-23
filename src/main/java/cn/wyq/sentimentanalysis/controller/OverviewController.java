package cn.wyq.sentimentanalysis.controller;

import cn.wyq.sentimentanalysis.entity.dto.Overview;
import cn.wyq.sentimentanalysis.service.BookService;
import cn.wyq.sentimentanalysis.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/overview")
public class OverviewController {

    // 书籍
    @Autowired
    private BookService bookService;
    // 评论
    @Autowired
    private CommentService commentService;

    /**
     * 跳转页面
     * @return 数据总览页面
     */
    @RequestMapping("/")
    public String init(){
        return "overview";
    }

    /**
     * 全部数据情感倾向分析数据
     * @return
     */
    @RequestMapping("/allBook")
    @ResponseBody
    public Overview allBook(){
        int bookCount = bookService.countBookId();
        int posCount = commentService.countByCommentEmotion(1);
        int negCount = commentService.countByCommentEmotion(0);
        return new Overview(-1,bookCount,posCount,negCount,null);
    }

}
