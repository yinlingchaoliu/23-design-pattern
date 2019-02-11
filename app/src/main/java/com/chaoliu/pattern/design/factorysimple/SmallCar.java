package com.chaoliu.pattern.design.factorysimple;

public class SmallCar implements ICar {
    @Override
    public void drive() {
        System.out.println( "小轿车" );
    }
}
