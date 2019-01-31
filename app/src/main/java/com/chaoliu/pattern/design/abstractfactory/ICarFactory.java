package com.chaoliu.pattern.design.abstractfactory;

/**
 * 汽车工厂
 */
public interface ICarFactory {

    IBrake createBrake();
    IEngine createEngine();
    ITire createTire();

}
