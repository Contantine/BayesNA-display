package cn.wyq.sentimentanalysis.entity.result;


import lombok.Data;

@Data
public class BaseResult {
    // 返回状态码
    private int code;
    // 返回信息
    private String message;

    public BaseResult(int code,String message){
        this.code = code;
        this.message = message;
    }
}
