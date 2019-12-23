package cn.wyq.sentimentanalysis.controller;

import cn.wyq.sentimentanalysis.entity.pojo.BookEmotion;
import cn.wyq.sentimentanalysis.entity.pojo.Comment;
import cn.wyq.sentimentanalysis.entity.result.DataTableResult;
import cn.wyq.sentimentanalysis.entity.result.JsonResult;
import cn.wyq.sentimentanalysis.service.BookEmotionService;
import cn.wyq.sentimentanalysis.service.CommentService;
import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/book")
public class BookInfoController {
    @Autowired
    private BookEmotionService bookEmotionService;

    @Autowired
    private CommentService commentService;
    /**
     * 根据书籍编号跳转页面
     * @param model 页面
     * @param bookId 书籍编号
     * @return 书籍信息页面
     */
    @RequestMapping("/{bookId}")
    public String bookInfo(Model model, @PathVariable("bookId")int bookId,
                           @RequestParam("bookName")String bookName){
        model.addAttribute("bookId",bookId);
        model.addAttribute("bookName",bookName);
//        model.addAttribute("page",page);
//        model.addAttribute("size",size);
        return "book_info";
    }

    /**
     * 根据书籍编号获得书籍情感倾向信息
     * @param bookId 书籍编号
     * @return
     */
    @RequestMapping("/bookEmotion")
    @ResponseBody
    public JsonResult bookEmotion(int bookId){
        BookEmotion bookEmotion = bookEmotionService.selectAllByBookId(bookId);
        JSONObject jsonObject =new JSONObject();
        jsonObject.put("bookId",bookEmotion.getBookId());
        jsonObject.put("commentCount",bookEmotion.getCommentCount());
        jsonObject.put("posCommentCount",bookEmotion.getPosCommentCount());
        jsonObject.put("negCommentCount",bookEmotion.getNegCommentCount());
        jsonObject.put("bookName",bookEmotion.getBook().getBookName());
        return new JsonResult(0,"获取书籍信息成功",jsonObject);
    }

    @RequestMapping("/comment")
    @ResponseBody
    public DataTableResult bookEmotion(int page, int size, int bookId,
                                       @RequestParam(value = "emotion",defaultValue = "-1") int emotion,
                                       @RequestParam(value = "order",defaultValue = "null")String order){
        PageInfo<Comment> cm = commentService.selectByBookId(page,size,bookId,emotion,order);
        return new DataTableResult(0,"获取评论信息成功",cm.getList(),(int)cm.getTotal());

    }
}
