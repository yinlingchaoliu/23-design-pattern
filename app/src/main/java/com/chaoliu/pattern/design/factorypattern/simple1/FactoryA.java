package com.chaoliu.pattern.design.factorypattern.simple1;

public class FactoryA implements Factory{
    @Override
    public Product createProduct() {
        return new ProductA();
    }
}
