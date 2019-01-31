package com.chaoliu.pattern.design.abstractfactory;

public class NormalFactory implements ICarFactory {
    @Override
    public IBrake createBrake() {
        return new NormalBrake();
    }

    @Override
    public IEngine createEngine() {
        return new NormalEngine();
    }

    @Override
    public ITire createTire() {
        return new NormalTire();
    }
}
