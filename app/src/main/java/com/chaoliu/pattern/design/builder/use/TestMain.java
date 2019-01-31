package com.chaoliu.pattern.design.builder.use;


public class TestMain {

    public static void main(String[] args) {
        Request request = new Request.Builder()
                .setHead( "head" )
                .setParm( "parm" )
                .setBody( "body" )
                .create();
    }

}
