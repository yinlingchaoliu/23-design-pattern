package com.chaoliu.pattern.design.singleton;

/**
 * 内部静态类 单例
 * @author chentong
 *
 */
public class Singleton {

    private Singleton(){

    }

    /**
     * 静态内部类
     */
    private static class SingletonHolder{
        public static final Singleton INSTANCE = new Singleton();
    }

    public static Singleton getInstance(){
        return SingletonHolder.INSTANCE;
    }

}