package com.chaoliu.pattern.design.strategy;

public class Price {
    private IMemberStrategy strategy;

    public Price(IMemberStrategy strategy){
        this.strategy = strategy;
    }

    public double quote(double booksPrice){
        return strategy.discount(booksPrice);
    }

}
