package com.chaoliu.pattern.design.builder.use;

/**
 * 建造者 省略Driector
 * 优点 动态参数配置
 */
public class Request {

    private String body;
    private String head;
    private String parm;

    public void setBody(String body) {
        this.body = body;
    }

    public void setHead(String head) {
        this.head = head;
    }

    public void setParm(String parm) {
        this.parm = parm;
    }

    /**
     *
     */
    public static class Builder{

        private String body;
        private String head;
        private String parm;

        public Builder setBody(String body) {
            this.body = body;
            return this;
        }

        public Builder setHead(String head) {
            this.head = head;
            return this;
        }

        public Builder setParm(String parm) {
            this.parm = parm;
            return this;
        }

        public Request create(){
            Request request = new Request();
            request.setHead( head );
            request.setParm( parm );
            request.setBody( body );
            return request;
        }
    }
}