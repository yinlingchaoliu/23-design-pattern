package com.chaoliu.pattern.design.abstractfactory;


/**
 * 一簇抽象接口
 */
public class TestMain {

    public static void main(String[] args) {
        ICarFactory normalFactory = new NormalFactory();
        normalFactory.createBrake().brake();
        normalFactory.createEngine().engine();
        normalFactory.createTire().tire();


        ICarFactory factory = new SuvFactory();
        factory.createBrake().brake();
        factory.createEngine().engine();
        factory.createTire().tire();

    }

}
