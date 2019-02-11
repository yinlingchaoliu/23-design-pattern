package com.chaoliu.pattern.design.interpreterpattern;

/**
 * 加法
 */
public class SubtractionExpression implements IArithemticExpression{

    private IArithemticExpression exp1,exp2;

    public SubtractionExpression(IArithemticExpression exp1, IArithemticExpression exp2){
        this.exp1 = exp1;
        this.exp2 = exp2;
    }

    @Override
    public int interpreter() {
        return exp1.interpreter() - exp2.interpreter();
    }
}
