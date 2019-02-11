package com.chaoliu.pattern.design.command;

public class DownCommand implements ICommand {

    private Receive receive;

    public DownCommand(Receive receive){
        this.receive = receive;
    }

    @Override
    public void execute() {
        receive.toDown();
    }
}