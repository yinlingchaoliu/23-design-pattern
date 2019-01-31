package com.chaoliu.pattern.design.factorypattern.simple2;

/**
 * 工厂
 */
public interface Factory {
    <T extends Product> T createProduct(Class<T> clazz);
}