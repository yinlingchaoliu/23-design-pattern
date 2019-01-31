package com.chaoliu.pattern.design.status;

public class TVController implements ITvStatus,IPowerController{

    private ITvStatus mTvStatus = new PowerOffState();

    public void setmTvStatus(ITvStatus mTvStatus) {
        this.mTvStatus = mTvStatus;
    }

    @Override
    public void powerOn() {
        setmTvStatus( new PowerOnState() );
    }

    @Override
    public void powerOff() {
        setmTvStatus( new PowerOffState() );
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