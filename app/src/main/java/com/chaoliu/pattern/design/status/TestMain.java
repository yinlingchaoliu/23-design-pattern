package com.chaoliu.pattern.design.status;

/**
 * 状态模式
 * 行为是平行关系，不可替换，自我状态改变
 */
public class TestMain {

    public static void main(String[] args){

        TVController tvController = new TVController();
        tvController.nextChannel();
        tvController.powerOff();
        tvController.powerOn();
        tvController.turnDown();

    }
}
