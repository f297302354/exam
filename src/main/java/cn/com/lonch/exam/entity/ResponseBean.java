package cn.com.lonch.exam.entity;

/**
 * 模拟公共返回结果，里面的方法暂时省略，大概有根据枚举初始化对象，有静态方法转换为字符结果，例如使用json格式
 */
public class ResponseBean {

    public ResponseBean(){}

    public ResponseBean(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    private String code;

    private String msg;

    private Object result;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getResult() {
        return result;
    }

    public void setResult(Object result) {
        this.result = result;
    }
}
