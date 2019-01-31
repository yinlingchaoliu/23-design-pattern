package com.chaoliu.pattern.design.singleton;

/**
 * 懒汉式单例
 * 线程安全
 * @author chentong
 */
public class LazySingleton {

    private static  LazySingleton lazySingleton;

    private LazySingleton(){
    }

    public static synchronized LazySingleton getInstance(){
        if(lazySingleton == null){
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }

}
