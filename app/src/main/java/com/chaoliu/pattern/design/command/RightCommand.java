package com.chaoliu.pattern.design.command;

public class RightCommand implements ICommand {

    private Receive receive;

    public RightCommand(Receive receive){
        this.receive = receive;
    }

    @Override
    public void execute() {
        receive.toRight();
    }
}
