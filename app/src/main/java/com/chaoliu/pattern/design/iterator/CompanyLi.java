package com.chaoliu.pattern.design.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * 公司
 */
public class CompanyLi implements Collection<Employee>{

    private Iterator<Employee> iterator;

    public CompanyLi(){
        List<Employee> list = new ArrayList<>(  );
        list.add(new Employee("小民", 26, "男", "程序猿"));
        list.add(new Employee("小芸", 22, "女", "测试"));
        list.add(new Employee("小方", 18, "女", "测试"));
        list.add(new Employee("可儿", 21, "女", "设计"));
        iterator = new ListIterator<>( list );
    }

    @Override
    public Iterator<Employee> iterator() {
        return iterator;
    }
}