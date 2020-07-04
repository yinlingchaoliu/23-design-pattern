package com.chaoliu.pattern.design.agent.proxy2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 动态代理
 */
public class DynamicProxy {

    public static <T> T create(Class<T> serivce, final Object newInstance) {
        InvocationHandler proxy = new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                return method.invoke( newInstance, args );
            }
        };
        ClassLoader loader = serivce.getClassLoader();
        return (T) Proxy.newProxyInstance( loader, new Class[]{serivce}, proxy );
    }

    //retrofit写法

    /**
     * 没有真正实体类
     * 可以用invoke方法反射
     * @param service
     * @param <T>
     * @return
     */
    public static <T> T create(Class<T> service) {
        ClassLoader loader = service.getClassLoader();

        InvocationHandler proxy = new InvocationHandler() {

            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                //这里填写回调，没有newInstance retrofit用法
                return null;
            }
        };
        return (T) Proxy.newProxyInstance( loader, new Class[]{service}, proxy );
    }

    /**
     * 需要那个接口 泛型指向那个
     * @param newInstance
     * @param <T>
     * @return
     */
    public static <T> T create(final Object newInstance) {

        InvocationHandler proxy = new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                return method.invoke( newInstance, args );
            }
        };

        //获得接口列表
        Class[] ifaces = newInstance.getClass().getInterfaces();
        //获取实体类classLoader
        ClassLoader loader = newInstance.getClass().getClassLoader();
        //获得动态代理实例
        return (T) Proxy.newProxyInstance( loader, ifaces, proxy );
    }

}
