package cn.qidewang.doMain;


/**
* @author 78692
* @date 17:17
* @param 
*/
public class Result<T> {

    /*返回状态码
    *  0 失败
    *  1 成功*/
    private Integer resultcode;

    private String message;

    private T data;

    public Integer getResultcode() {
        return resultcode;
    }

    public void setResultcode(Integer resultcode) {
        this.resultcode = resultcode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

}
