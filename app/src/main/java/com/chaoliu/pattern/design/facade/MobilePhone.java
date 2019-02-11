package com.chaoliu.pattern.design.facade;

public class MobilePhone {
    private Phone mPhone = new PhoneImpl();
    private Camera mCamera = new CameraImpl();

    public void dail(){
        mPhone.dail();
    }

    public void hangup(){
        mPhone.hangup();
    }

    public void takePicture(){
        mCamera.open();
        mCamera.takePicture();
    }

    public void closeCamera(){
        mCamera.close();
    }

    public void videoChat(){
        mCamera.open();
        mPhone.dail();
    }

}
