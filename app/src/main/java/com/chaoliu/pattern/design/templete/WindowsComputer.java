package com.chaoliu.pattern.design.templete;

/**
 * windows电脑
 */
public class WindowsComputer extends AbstractComputer {

    @Override
    public void powerOn() {
        System.out.println("Windows电脑开启电源");
    }

    @Override
    public void checkHardware() {
        System.out.println("Windows电脑检查硬件");
    }

    @Override
    public void loadOS() {
        System.out.println("Windows电脑载入操作系统");
    }

    @Override
    public void login() {

    }

    @Override
    public boolean isLogin() {
        return false;//返回false，不需登录
    }

}
