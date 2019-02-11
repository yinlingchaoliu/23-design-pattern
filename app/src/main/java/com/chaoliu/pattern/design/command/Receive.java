package com.chaoliu.pattern.design.command;

/**
 * 真正引擎
 */
public class Receive implements IReceive{

    public void toLeft(){
        System.out.println("向左");
    }

    public void toRight(){
        System.out.println("向右");
    }

    public void toUp(){
        System.out.println("向上");
    }

    public void toDown(){
        System.out.println("向下");
    }

}
