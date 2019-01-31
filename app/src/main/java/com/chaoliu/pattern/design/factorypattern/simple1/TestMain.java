package com.chaoliu.pattern.design.factorypattern.simple1;

/**
 * 让子类决定实例化那个类
 * 工厂方法
 */
public class TestMain {

    public static void main(String[] args) {
        Factory factory = new FactoryA();
        Product product = factory.createProduct();
        product.method();
    }

}
