package com.chaoliu.pattern.design.bridge;

public class Sugar extends CoffeeAdditives {
    @Override
    public String addSomething() {
        return "加糖";
    }
}
