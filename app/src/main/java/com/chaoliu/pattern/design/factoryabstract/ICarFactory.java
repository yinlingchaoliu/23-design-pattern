package com.chaoliu.pattern.design.factoryabstract;

/**
 * 汽车工厂
 */
public interface ICarFactory {

    IBrake createBrake();
    IEngine createEngine();
    ITire createTire();

}
