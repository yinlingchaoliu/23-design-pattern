package com.chaoliu.pattern.design.iterator;

/**
 *
 * 迭代器模式
 *
 * 遍历又不暴露细节
 *
 * 支持对容器对象的多种遍历。弱化了容器类与遍历算法之间的关系
 *
 */
public class TestMain {

    public static void main(String[] args) {

        CompanyLi companyLi = new CompanyLi();

        //迭代
        Iterator iterator = companyLi.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next().toString());
        }

    }

}
