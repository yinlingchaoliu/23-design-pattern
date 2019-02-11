package com.chaoliu.pattern.design.factorysimple;

public class CarFactory {

    public static ICar createCar(CarType type){
        switch (type){
            case SMALL_CAR:
                return new SmallCar();
            case JEEP_CAR:
                return new JeepCar();
            case SPORT_CAR:
                return new SportCar();
            default:
                return new SmallCar();
        }
    }

}
