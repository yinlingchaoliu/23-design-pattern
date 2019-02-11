package com.chaoliu.pattern.design.iteratorpattern.simple1;

//经理
public class Manager extends Leader {

    @Override
    public int hasLimit() {
        return 10000;
    }

    @Override
    public String hasJob() {
        return "经理";
    }
}
