package com.chaoliu.pattern.design.factorypattern.simple2;


/**
 * 让子类决定实例化那个类
 * 工厂方法
 */
public class TestMain {

    public static void main(String[] args) {
        Factory factory = new ConcreteFactory();
        Product product = factory.createProduct( ProductA.class );
        product.method();
    }

}
