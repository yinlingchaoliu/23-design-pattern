package com.chaoliu.pattern.design.adapter;

public class TestMain {

    /**
     * Target Adapter Adaptee
     * @param args 树型结构
     */
    public static void main(String[] args) {
        VoltAdapter adapter = new VoltAdapter();
        System.out.println("输出电压：" + adapter.getVolt5());
    }

}
