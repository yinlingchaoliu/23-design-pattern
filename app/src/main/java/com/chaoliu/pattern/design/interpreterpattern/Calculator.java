package com.chaoliu.pattern.design.interpreterpattern;

import java.util.Stack;

public class Calculator implements IArithemticExpression{

    private Stack<IArithemticExpression> mExpStack = new Stack<>();

    public Calculator(String expression){

        String[] elements = expression.split(" ");

        for(int i= 0 ;i < elements.length;i++){

            switch (elements[i].charAt(0)){

                case '+':
                    IArithemticExpression exp1 = mExpStack.pop();
                    IArithemticExpression exp2 = new NumExpression(Integer.parseInt(elements[++i]));
                    mExpStack.push( new AdditionExpression( exp1,exp2 ) );
                    break;

                case '-':
                    IArithemticExpression exp3 = mExpStack.pop();
                    IArithemticExpression exp4 = new NumExpression(Integer.parseInt(elements[++i]));
                    mExpStack.push( new SubtractionExpression( exp3,exp4 ) );
                    break;

                default:
                    mExpStack.push(new NumExpression(Integer.valueOf(elements[i])));
                    break;

            }

        }

    }

    /**
     * 计算
     * @return
     */
    @Override
    public int interpreter() {
        int tmp = 0;
        for (IArithemticExpression exp : mExpStack){
            tmp = tmp + exp.interpreter();
        }
        return tmp;
    }
}
