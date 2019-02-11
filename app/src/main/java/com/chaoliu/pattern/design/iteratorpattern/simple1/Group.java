package com.chaoliu.pattern.design.iteratorpattern.simple1;

public class Group extends Leader{

    @Override
    public int hasLimit() {
        return 3000;
    }

    @Override
    public String hasJob() {
        return "组员";
    }
}
