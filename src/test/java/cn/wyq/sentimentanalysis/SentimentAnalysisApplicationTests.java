package cn.wyq.sentimentanalysis;

import cn.wyq.sentimentanalysis.mapper.BookEmotionMapper;
import cn.wyq.sentimentanalysis.mapper.CommentMapper;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest(classes ={SentimentAnalysisApplication.class},webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@RunWith(SpringRunner.class)
class SentimentAnalysisApplicationTests {
    @Autowired
    private BookEmotionMapper bookEmotionMapper;
    @Autowired
    private CommentMapper commentMapper;

    @Test
    void contextLoads() {
        System.out.println(commentMapper.selectAllByBookId(12,-1,null));
    }

}
