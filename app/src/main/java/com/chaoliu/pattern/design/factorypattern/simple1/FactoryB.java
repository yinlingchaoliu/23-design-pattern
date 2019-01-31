package com.chaoliu.pattern.design.factorypattern.simple1;

public class FactoryB implements Factory{
    @Override
    public Product createProduct() {
        return new ProductB();
    }
}
