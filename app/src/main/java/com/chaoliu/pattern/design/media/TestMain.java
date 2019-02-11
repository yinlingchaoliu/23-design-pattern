package com.chaoliu.pattern.design.media;

/**
 * 从多对多网状关系
 * 变成一对多
 *
 */
public class TestMain {

    public static void main(String[] args){

        MainBoard mediator = new MainBoard();

        CPU cpu = new CPU( mediator );
        CDDevice cdDevice = new CDDevice( mediator );
        SoundCard soundCard = new SoundCard( mediator );

        mediator.setCdDevice( cdDevice );
        mediator.setCpu( cpu );
        mediator.setSoundCard( soundCard );

        cdDevice.action();

    }

}
