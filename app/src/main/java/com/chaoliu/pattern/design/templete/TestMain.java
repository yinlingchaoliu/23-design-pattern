package com.chaoliu.pattern.design.templete;

/**
 * 模板方法
 *
 */
public  class TestMain {

    public static void main(String[] args){

        AbstractComputer computer = new WindowsComputer();
        computer.startUp();

    }

}
