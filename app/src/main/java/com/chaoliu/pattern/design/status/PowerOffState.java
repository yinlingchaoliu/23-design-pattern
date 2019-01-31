package com.chaoliu.pattern.design.status;

public class PowerOffState implements ITvStatus{
    @Override
    public void nextChannel() {
        System.out.println("----------");
    }

    @Override
    public void prevChannel() {
        System.out.println("----------");
    }

    @Override
    public void turnUp() {
        System.out.println("----------");
    }

    @Override
    public void turnDown() {
        System.out.println("----------");
    }
}
