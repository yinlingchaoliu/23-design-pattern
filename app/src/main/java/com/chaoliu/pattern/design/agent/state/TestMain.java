package com.chaoliu.pattern.design.agent.state;


public class TestMain {

    public static void main(String[] args) {

        ILawsuit xiaomin = new XiaoMin();

        //静态代理
        ILawsuit lawyer = new Lawyer( xiaomin );

        lawyer.submit();

        lawyer.burden();

        lawyer.defend();

        lawyer.finish();

    }

}
