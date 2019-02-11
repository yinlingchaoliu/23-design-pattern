package com.chaoliu.pattern.design.status;

public class TVController implements ITvStatus,IPowerController{

    private ITvStatus mTvStatus = new PowerOffState();

    public void setmTvStatus(ITvStatus mTvStatus) {
        this.mTvStatus = mTvStatus;
    }

    @Override
    public void powerOn() {
        setmTvStatus( new PowerOnState() );
        System.out.println("开机");
    }

    @Override
    public void powerOff() {
        setmTvStatus( new PowerOffState() );
        System.out.println("关机");

    }

    @Override
    public void nextChannel() {
        mTvStatus.nextChannel();
    }

    @Override
    public void prevChannel() {
        mTvStatus.prevChannel();
    }

    @Override
    public void turnUp() {
        mTvStatus.turnUp();
    }

    @Override
    public void turnDown() {
        mTvStatus.turnDown();
    }
}