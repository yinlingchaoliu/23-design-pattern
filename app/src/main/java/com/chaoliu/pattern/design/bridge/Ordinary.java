package com.chaoliu.pattern.design.bridge;

public class Ordinary extends CoffeeAdditives {
    @Override
    public String addSomething() {
        return "原味";
    }
}
