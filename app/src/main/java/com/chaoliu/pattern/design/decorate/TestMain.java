package com.chaoliu.pattern.design.decorate;


public class TestMain {


    /**
     * 装饰模式
     * 层层给装饰方法添加新内容
     * eg context contextwrapper
     * 装饰模式比继承更加灵活性
     * @param args
     */
    public static void main(String[] args) {

        Person girl = new Girl();

        PersonWrapper wrapper = new PersonWrapper( girl );
        wrapper.dressed();

        PersonWrapper style = new PersonClothSytle( girl );
        style.dressed();

    }

}
