package com.chaoliu.pattern.design.iteratorpattern.simple1;

public class Boss extends Leader {

    @Override
    public int hasLimit() {
        return Integer.MAX_VALUE;
    }

    @Override
    public String hasJob() {
        return "老板";
    }
}
