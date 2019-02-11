package com.chaoliu.pattern.design.bridge;

/**
 * 咖啡制造
 */
public abstract class Coffee {

    protected CoffeeAdditives impl;

    public Coffee(CoffeeAdditives impl) {
        this.impl = impl;
    }

    public abstract void makeCoffee();
}
