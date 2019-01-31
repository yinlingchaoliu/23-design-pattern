package com.chaoliu.pattern.design.strategy;

public class IntermediateMemberStrategy implements IMemberStrategy {
    @Override
    public double discount(double price) {
        return price * 0.9;
    }
}
