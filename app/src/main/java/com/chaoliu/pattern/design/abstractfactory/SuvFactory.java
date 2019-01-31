package com.chaoliu.pattern.design.abstractfactory;

public class SuvFactory implements ICarFactory {
    @Override
    public IBrake createBrake() {
        return new SuvBrake();
    }

    @Override
    public IEngine createEngine() {
        return new SuvEngine();
    }

    @Override
    public ITire createTire() {
        return new SuvTire();
    }
}