package com.chaoliu.pattern.design.observer;

/**
 * 被观察者
 */
public interface IObservable {
    //注册
    void register(IObserver observer);
    //通知
    void notify(String msg);

}