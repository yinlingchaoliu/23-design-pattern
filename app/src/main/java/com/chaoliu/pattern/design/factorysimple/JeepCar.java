package com.chaoliu.pattern.design.factorysimple;

public class JeepCar implements ICar {
    @Override
    public void drive() {
        System.out.println( "吉普车" );
    }
}
