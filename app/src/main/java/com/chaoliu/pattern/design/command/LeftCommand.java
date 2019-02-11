package com.chaoliu.pattern.design.command;

public class LeftCommand implements ICommand {

    private Receive receive;

    public LeftCommand(Receive receive){
        this.receive = receive;
    }

    @Override
    public void execute() {
        receive.toLeft();
    }
}
