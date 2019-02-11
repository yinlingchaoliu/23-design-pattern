package com.chaoliu.pattern.design.templete;

/**
 * 电脑核心流程
 */
public interface IComputer {

    //开启电源
    void powerOn();

    //检查硬件
    void checkHardware();

    //载入操作系统
    void loadOS();

    //登录
    void login();

    //是否登录
    boolean isLogin();

    //启动完整流程
    void startUp();

}