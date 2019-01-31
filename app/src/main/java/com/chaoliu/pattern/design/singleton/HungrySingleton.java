package com.chaoliu.pattern.design.singleton;

/**
 *
 * 饿汉式单例
 * @author chentong
 * 非线程安全
 *
 */
public class HungrySingleton {

    private static HungrySingleton hungrySingleton = new HungrySingleton();

    private HungrySingleton(){

    }

    public HungrySingleton getInstance(){
        return hungrySingleton;
    }

}