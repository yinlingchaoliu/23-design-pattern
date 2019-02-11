package com.chaoliu.pattern.design.iteratorpattern.simple1;


/**
 * 责任链模式
 */
public class TestMain {

    public static void main(String[] args){

        Boss boss = new Boss();
        Manager manager = new Manager();
        Director director = new Director();
        Group group = new Group();

        //确定汇报关系
        group.requestPermission( director );
        director.requestPermission( manager );
        manager.requestPermission( boss );
        boss.requestPermission( null );


        //组员汇报
        group.handleRequest( 2000 );

        //主管处理
        director.handleRequest( 300 );

        //经理处理
        manager.handleRequest( 20000 );

        //老板处理
        boss.handleRequest( 100 );
        boss.handleRequest( 1000 );
        boss.handleRequest( 900000 );

    }
}
