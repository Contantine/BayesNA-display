package cn.wyq.sentimentanalysis.entity.result;

import com.alibaba.fastjson.JSONObject;
import lombok.Data;

@Data
public class JsonResult extends BaseResult{
    private JSONObject data;

    public JsonResult(int code,String message,JSONObject jsonObject){
        super(code,message);
        this.data = jsonObject;
    }

}
