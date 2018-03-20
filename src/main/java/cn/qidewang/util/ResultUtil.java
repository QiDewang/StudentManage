package cn.qidewang.util;

import cn.qidewang.doMain.Result;

public class ResultUtil {

    public static Result success(Object data){
        Result result = new Result();
        result.setResultcode(1);
        result.setMessage("请求成功");
        result.setData(data);
        return result;
    }
}
