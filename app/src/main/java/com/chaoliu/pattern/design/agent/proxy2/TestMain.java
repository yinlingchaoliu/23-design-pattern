package com.chaoliu.pattern.design.agent.proxy2;

public class TestMain {

    public static void main(String args[]){
//        ILawsuit lawsuit =  DynamicProxy.create( ILawsuit.class, new XiaoMin() );
        ILawsuit lawsuit =  DynamicProxy.create(  new XiaoMin() );

        lawsuit.submit();
        lawsuit.burden();
        lawsuit.defend();
        lawsuit.finish();

        IArgue argue =  DynamicProxy.create(  new XiaoMin() );
        argue.argue();
    }

    static void log(String msg){
        System.out.println(msg);
    }
}
