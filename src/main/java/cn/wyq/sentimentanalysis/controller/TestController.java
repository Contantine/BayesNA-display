package cn.wyq.sentimentanalysis.controller;

import cn.wyq.sentimentanalysis.entity.pojo.Book;
import cn.wyq.sentimentanalysis.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/test")
public class TestController {
    @Autowired
    private BookService bookService;

    @RequestMapping("/index")
    public String test(){
        return "test";
    }

    @RequestMapping("/book")
    @ResponseBody
    public Integer getBook(){
        return bookService.countBookId();
    }
}
