package com.chaoliu.pattern.design.observer;

/**
 * 观察者
 */
public class User implements IObserver {

    private String name;

    public User(String name) {
        this.name = name;
    }

    @Override
    public void update(String msg) {
        System.out.println( name + "," + msg + "更新了！" );
    }

}