package com.chaoliu.pattern.design.iterator;

/**
 * 雇员
 */
public class Employee {
    private String name;// 姓名
    private int age;// 年龄
    private String sex;// 性别
    private String position;// 职位

    public Employee(String name, int age, String sex, String position) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.position = position;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", position='" + position + '\'' +
                '}';
    }
}