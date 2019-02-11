package com.chaoliu.pattern.design.iteratorpattern.simple1;

public class Director extends Leader{

    @Override
    public int hasLimit() {
        return 5000;
    }

    @Override
    public String hasJob() {
        return "主管";
    }
}
