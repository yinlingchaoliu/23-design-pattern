package com.chaoliu.pattern.design.command;

public class Button implements IReceive{

    private LeftCommand leftCommand;
    private RightCommand rightCommand;
    private UpCommand upCommand;
    private DownCommand downCommand;

    public void setLeftCommand(LeftCommand leftCommand) {
        this.leftCommand = leftCommand;
    }

    public void setRightCommand(RightCommand rightCommand) {
        this.rightCommand = rightCommand;
    }

    public void setUpCommand(UpCommand upCommand) {
        this.upCommand = upCommand;
    }

    public void setDownCommand(DownCommand downCommand) {
        this.downCommand = downCommand;
    }

    @Override
    public void toLeft() {
        leftCommand.execute();
    }

    @Override
    public void toRight() {
        rightCommand.execute();
    }

    @Override
    public void toUp() {
        upCommand.execute();
    }

    @Override
    public void toDown() {
        downCommand.execute();
    }
}
