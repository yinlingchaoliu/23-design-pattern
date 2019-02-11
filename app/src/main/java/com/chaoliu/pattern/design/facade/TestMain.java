package com.chaoliu.pattern.design.facade;

/**
 *
 * 外观模式
 * 对客户程序隐藏子系统的细节，因而减少了客户对于子系统的耦合，能够拥抱变化。
 */
public class TestMain {

    //系统对外的统一接口，系统内部系统地工作
    public static void main(String[] args) {
        MobilePhone mobilePhone = new MobilePhone();
        mobilePhone.takePicture();
        mobilePhone.videoChat();
    }

}