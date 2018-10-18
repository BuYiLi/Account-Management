package com.buyi.common.entity;

public class ResponseTemplateBuilder {

    private int code;

    private String msg;

    private Object body;

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

    public Object getBody() {
        return body;
    }

    public void setBody(Object body) {
        this.body = body;
    }

    public static class Build {
        private ResponseTemplateBuilder builder;

        public Build() {
            this.builder = new ResponseTemplateBuilder();
        }

        public Build code(int code) {
            builder.code = code;
            return this;
        }

        public Build msg(String msg){
            builder.msg = msg;
            return this;
        }

        public Build body(Object body){
            builder.body = body;
            return this;
        }

        public ResponseTemplateBuilder build(){
            return builder;
        }
    }

    public static class Success{
        private ResponseTemplateBuilder builder;

        public Success(){
            builder = new ResponseTemplateBuilder();
            builder.code = 1;
            builder.msg = "成功";
        }

        public Success body(Object body){
            builder.body = body;
            return this;
        }

        public ResponseTemplateBuilder build(){
            return builder;
        }
    }

    public static class Failed{
        private ResponseTemplateBuilder builder;

        public Failed(){
            builder = new ResponseTemplateBuilder();
            builder.code = 2;
            builder.msg = "失败";
        }

        public Failed body(Object body){
            builder.body = body;
            return this;
        }

        public ResponseTemplateBuilder build(){
            return builder;
        }
    }
}
