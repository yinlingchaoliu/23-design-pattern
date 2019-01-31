package com.chaoliu.pattern.design.builder.common;


public class TestMain {

    public static void main(String[] args) {

        ConcreteBuilder builder = new ConcreteBuilder();
        Director director = new Director( builder );
        director.constructProduct();
    }

}
