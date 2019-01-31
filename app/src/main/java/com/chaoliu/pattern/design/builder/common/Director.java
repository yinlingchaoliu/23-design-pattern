package com.chaoliu.pattern.design.builder.common;

/**
 * 建造者
 */
public class Director {

    private Builder builder;

    public  Director(Builder builder) {
        this.builder = builder;
    }

    /**
     * 策略
     */
    public void constructProduct(){
        builder.buildPartA();
        builder.buildPartB();
        builder.buildPartC();
    }

}
