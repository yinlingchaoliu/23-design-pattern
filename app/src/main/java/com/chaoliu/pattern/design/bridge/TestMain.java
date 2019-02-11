package com.chaoliu.pattern.design.bridge;


public class TestMain {

    /**
     *
     * 桥接模式
     */
    public static void main(String[] args) {

        CoffeeAdditives sugar = new Sugar();
        CoffeeAdditives ordinary = new Ordinary();

        //大杯咖啡  原味
        LargeCoffee largeCoffeeOrdinary = new LargeCoffee(ordinary);
        largeCoffeeOrdinary.makeCoffee();

        //小杯咖啡  原味
        SmallCoffee smallCoffeeOrdinary = new SmallCoffee(ordinary);
        smallCoffeeOrdinary.makeCoffee();

        //大杯咖啡  加糖
        LargeCoffee largeCoffeeSugar = new LargeCoffee(sugar);
        largeCoffeeSugar.makeCoffee();

        //小杯咖啡  加糖
        SmallCoffee smallCoffeeSugar = new SmallCoffee(sugar);
        smallCoffeeSugar.makeCoffee();
    }

}
