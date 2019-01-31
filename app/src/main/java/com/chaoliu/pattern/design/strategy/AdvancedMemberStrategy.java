package com.chaoliu.pattern.design.strategy;

public class AdvancedMemberStrategy implements IMemberStrategy {
    @Override
    public double discount(double price) {
        return price * 0.8;
    }
}
