package com.chaoliu.pattern.design.agent.proxy1;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Proxy;


public class SubjectProxy<T> {

    //获得动态实例
    public T newInstance(Object obj) {
        DynamicProxy proxy = new DynamicProxy( obj );
        ClassLoader loader = obj.getClass().getClassLoader();
        Class superclazz = getSuperclass();
        return (T) Proxy.newProxyInstance( loader, new Class[]{superclazz}, proxy );
    }

    //Java 得到泛型中得到T.class
    private Class getSuperclass() {
        return (Class<T>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
    }

}
