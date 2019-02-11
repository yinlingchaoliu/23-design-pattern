package com.chaoliu.pattern.design.iteratorpattern.simple1;

/**
 * 责任链
 */
public abstract class Leader implements InvokerHandler{

    private InvokerHandler nextHandler;

    @Override
    public void requestPermission(InvokerHandler handler) {
        this.nextHandler = handler;
    }

    @Override
    public void handleRequest(int limit) {

        if (limit <= hasLimit()){
            System.out.println(hasJob()+"拥有权限" +limit+"额度，审批");
        }else{
            if(nextHandler == null){
                System.out.println("没有上级汇报对象");
            }else {
                nextHandler.handleRequest( limit );
            }
        }

    }

}
