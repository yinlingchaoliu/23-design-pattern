package com.chaoliu.pattern.design.singleton;

/**
 * 懒汉式单例
 * Double Check Lock
 * 线程安全
 * @author chentong
 */
public class DoubleCheckSingleton {

    private static volatile DoubleCheckSingleton doubleCheckSingleton;

    private DoubleCheckSingleton(){
    }

    public static DoubleCheckSingleton getInstance(){

        if(doubleCheckSingleton == null){
            synchronized (DoubleCheckSingleton.class){
                if (doubleCheckSingleton == null){
                    doubleCheckSingleton = new DoubleCheckSingleton();
                }
            }
        }
        return doubleCheckSingleton;

    }

}
