package com.chaoliu.pattern.design.interpreterpattern;

/**
 * 数字
 */
public class NumExpression implements IArithemticExpression{

    private int num;

    public NumExpression(int num){
        this.num = num;
    }

    @Override
    public int interpreter() {
        return num;
    }

}
