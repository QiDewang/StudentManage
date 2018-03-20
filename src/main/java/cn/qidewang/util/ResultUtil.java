package cn.qidewang.util;

import cn.qidewang.doMain.Result;

public class ResultUtil {

    public static Result success(String msg, Object data){
        Result result = new Result();
        result.setResultcode(1);
        result.setMessage(msg);
        result.setData(data);
        return result;
    }
}
