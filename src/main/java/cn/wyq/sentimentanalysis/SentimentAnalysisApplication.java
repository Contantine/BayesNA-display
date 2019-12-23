package cn.wyq.sentimentanalysis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = {"cn.wyq.sentimentanalysis.mapper"})
public class SentimentAnalysisApplication {

    public static void main(String[] args) {
        SpringApplication.run(SentimentAnalysisApplication.class, args);
    }

}
