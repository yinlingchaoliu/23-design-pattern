package com.chaoliu.pattern.design.agent.proxy2;

public class TestMain {

    public static void main(String args[]){
//        ILawsuit lawsuit = new DynamicProxy().create(ILawsuit.class);
//


        ILawsuit lawsuit =  DynamicProxy.create( ILawsuit.class, new XiaoMin() );
        lawsuit.submit();
        lawsuit.burden();
        lawsuit.defend();
        lawsuit.finish();


//        ILawsuit lawsuit =  new DynamicProxy().create( new XiaoMin() );
//        lawsuit.submit();
//        lawsuit.burden();
//        lawsuit.defend();
//        lawsuit.finish();

//        ILawsuit lawsuit =  DynamicProxy().create( ILawsuit.class );
//        lawsuit.submit();
//        lawsuit.burden();
//        lawsuit.defend();
//        lawsuit.finish();

    }

    static void log(String msg){
        System.out.println(msg);
    }
}
