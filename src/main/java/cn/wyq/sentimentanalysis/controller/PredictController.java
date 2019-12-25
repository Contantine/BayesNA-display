package cn.wyq.sentimentanalysis.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.io.BufferedReader;
import java.io.InputStreamReader;

@RequestMapping("/predict")
@Controller
public class PredictController {
    @RequestMapping("/")
    public String index(){
        return "predict";
    }

    @RequestMapping("/try")
    @ResponseBody
    public String predict(@RequestParam("text")String text){
        try{
//            E:\workspace\python\douban-spider\analyze_runner.py
//            E:\workspace\python\douban-spider\java_test.py
            String[] argsP =new String[]{"python","E:\\workspace\\python\\douban-spider\\analyze_runner.py",text};
            Process pr = Runtime.getRuntime().exec(argsP);
            BufferedReader in = new BufferedReader(new InputStreamReader(
                    pr.getInputStream(), "GBK"));
            int re = pr.waitFor();
            String line;
            String res = null ;
            while ((line = in.readLine()) != null) {
                res = line;
            }
            in.close();
            return res;
        } catch (Exception e) {
            e.printStackTrace();
            return "预测失败";
        }
    }
}
