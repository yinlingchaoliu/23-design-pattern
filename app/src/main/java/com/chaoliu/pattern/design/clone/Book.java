package com.chaoliu.pattern.design.clone;

import java.util.ArrayList;

/**
 * 原型模式
 * 浅拷贝与深拷贝
 * 浅拷贝其内容
 * 深拷贝其对象
 */
public class Book implements Cloneable{

    private String title; //浅拷贝
    private ArrayList<String> images; //深拷贝

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public ArrayList<String> getImages() {
        return images;
    }

    public void setImages(ArrayList<String> images) {
        this.images = images;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Book book = (Book) super.clone();
        ArrayList imageList = (ArrayList)images.clone();
        book.setImages( imageList );
        return book;
    }

}
