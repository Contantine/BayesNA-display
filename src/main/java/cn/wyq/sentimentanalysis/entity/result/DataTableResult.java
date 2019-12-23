package cn.wyq.sentimentanalysis.entity.result;

import cn.wyq.sentimentanalysis.entity.dto.BookListDisplay;
import lombok.Data;

import java.util.List;

@Data
public class DataTableResult extends BaseResult {
    // 数据
    private List<?> data;
    // 数据长度
    private int count;

    public DataTableResult(int code, String message, List<?> data,int total){
        super(code,message);
        this.count = total;
        this.data = data;
    }
}
