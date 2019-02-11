package com.chaoliu.pattern.design.agent.proxy;

import java.lang.reflect.Proxy;

public class TestMain {

    public static void main(String[] args) {

        ILawsuit xiaomin = new XiaoMin();

        //动态代理
        DynamicProxy proxy = new DynamicProxy( xiaomin );

        //获取小民的classLoader
        ClassLoader loader = xiaomin.getClass().getClassLoader();
        //动态代理一个代理律师
        ILawsuit lawyer = (ILawsuit) Proxy.newProxyInstance( loader, new Class[]{ILawsuit.class}, proxy );

        lawyer.submit();
        lawyer.burden();
        lawyer.defend();
        lawyer.finish();

    }

}
