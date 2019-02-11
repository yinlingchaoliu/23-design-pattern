package com.chaoliu.pattern.design.iteratorpattern.simple1;

public interface InvokerHandler {

    //汇报工作
    void requestPermission(InvokerHandler handler);
    //处理核心逻辑
    void handleRequest(int limit);
    //当前权限
    int hasLimit();
    //当前职位
    String hasJob();

}