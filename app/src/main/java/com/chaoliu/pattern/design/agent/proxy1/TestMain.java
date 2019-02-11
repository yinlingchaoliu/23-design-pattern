package com.chaoliu.pattern.design.agent.proxy1;

public class TestMain {

    //为其他对象提供一种代理以控制对这个对象的访问
    public static void main(String[] args) {

        ILawsuit xiaomin = new XiaoMin();

        SubjectProxy<ILawsuit> subjectProxy = new SubjectProxy<ILawsuit>();

        ILawsuit lawyer = subjectProxy.newInstance( xiaomin );

        lawyer.submit();
        lawyer.burden();
        lawyer.defend();
        lawyer.finish();

    }

}
