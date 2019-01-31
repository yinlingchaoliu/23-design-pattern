package com.chaoliu.pattern.design.strategy;

public class PrimaryMemberStrategy implements IMemberStrategy {
    @Override
    public double discount(double price) {
        return price * 1;
    }
}
