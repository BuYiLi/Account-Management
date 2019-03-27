package com.buyi.constant;

public enum ResponseStatusEnum {
    /**
     * 1* 信息，服务器收到请求，需要请求者继续执行操作
     * 2* 成功，操作成功接收并处理
     * 3* 重定向，需要进一步的操作以完成请求
     * 4* 客户端错误，请求包含语法错误或无法完成请求
     * 5* 服务端错误， 服务器在处理请求的过程中发生了错误
     */

    SUCCESS(2,"success"),


    CLIENT_FAILED_PARAMETER(401,"Parameter failed!")
    ;

    private int code;
    private String msg;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    ResponseStatusEnum(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
