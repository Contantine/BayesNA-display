package cn.wyq.sentimentanalysis.controller;

import cn.wyq.sentimentanalysis.entity.dto.BookListDisplay;
import cn.wyq.sentimentanalysis.entity.pojo.BookEmotion;
import cn.wyq.sentimentanalysis.entity.result.DataTableResult;
import cn.wyq.sentimentanalysis.service.BookEmotionService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@RequestMapping("/bookList")
@Controller
public class BookListController {
    @Autowired
    private BookEmotionService bookEmotionService;

    /**
     * 书籍列表页面
     * @return
     */
    @RequestMapping("/")
    public String index(){
        return "book_list";
    }

    /**
     * 返回书籍列表信息
     * @param page 页吗
     * @param limit  一页数据的大小
     * @param param  排序字段
     * @param order  排序方式
     * @return  书籍列表数据
     */
    @RequestMapping("/all")
    @ResponseBody
    public DataTableResult getList(int page, int limit,@RequestParam(value = "param",defaultValue = "null") String param
            ,@RequestParam(value = "order",defaultValue = "desc") String order){
//        System.out.println("param:"+param+"  order:"+order);
        PageInfo<BookEmotion> pageInfo = bookEmotionService.selectAll(page,limit,param,order);
        List<BookEmotion> bookEmotions = pageInfo.getList();
        List<BookListDisplay> bookListDisplays = new ArrayList<>();
        for(BookEmotion bookEmotion:bookEmotions){
            bookListDisplays.add(new BookListDisplay(bookEmotion));
        }
//        System.out.println(pageInfo);
        return new DataTableResult(0,"获取数据成功",bookListDisplays,(int)pageInfo.getTotal());
    }
}
