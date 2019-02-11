package com.chaoliu.pattern.design.interpreterpattern;


/**
 *
 * 解释器模式
 * 计算器 文法分析
 * 1、词法分析
 * 2、计算策略
 * 解释与执行分离
 *
 */
public class TestMain {

    public static void main(String[] args) {

        //计算器
        Calculator calculator = new Calculator( "1 + 2 - 5 + 6 + 7" );
        calculator.interpreter();

    }

}
