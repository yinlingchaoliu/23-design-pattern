package com.chaoliu.pattern.design.visit;

/**
 * 访问者模式
 *
 */
public  class TestMain {

    public static void main(String[] args){

        //公司
        Company company = new Company();

        //访问者查看对应报告
        company.showReport( new CEOVisitor() );
        company.showReport( new HRVisitor() );
        company.showReport( new CTOVisitor() );
    }

}
