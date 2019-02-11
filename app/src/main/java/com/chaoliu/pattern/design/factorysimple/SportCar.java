package com.chaoliu.pattern.design.factorysimple;

public class SportCar implements ICar {
    @Override
    public void drive() {
        System.out.println( "运动车" );
    }
}
