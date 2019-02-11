package com.chaoliu.pattern.design.command;

/**
 * 命令模式
 *
 * 添加一层命令，便于记录
 *
 * 多对一
 *
 */
public class Player {

    public static void main(String[] args) {

        //接收者
        Receive receive = new Receive();

        //命令
        LeftCommand leftCommand = new LeftCommand( receive );
        RightCommand rightCommand = new RightCommand( receive );
        UpCommand upCommand = new UpCommand( receive );
        DownCommand downCommand = new DownCommand( receive );

        //发送者
        Button button = new Button();
        button.setLeftCommand( leftCommand );
        button.setRightCommand( rightCommand );
        button.setDownCommand( downCommand );
        button.setUpCommand( upCommand );

        //调用
        button.toLeft();
        button.toRight();
        button.toDown();
        button.toUp();

    }

}
