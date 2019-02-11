package com.chaoliu.pattern.design.command;

public class UpCommand implements ICommand {

    private Receive receive;

    public UpCommand(Receive receive){
        this.receive = receive;
    }

    @Override
    public void execute() {
        receive.toUp();
    }
}
