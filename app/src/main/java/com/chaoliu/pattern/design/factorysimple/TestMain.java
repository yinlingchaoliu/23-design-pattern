package com.chaoliu.pattern.design.factorysimple;


/**
 *
 * 简单工厂
 *
 */
public class TestMain {

    public static void main(String[] args){

        ICar smallCar = CarFactory.createCar( CarType.SMALL_CAR );
        smallCar.drive();

        ICar jeepCar = CarFactory.createCar( CarType.JEEP_CAR );
        jeepCar.drive();

        ICar sportCar = CarFactory.createCar( CarType.SPORT_CAR );
        sportCar.drive();

    }

}
