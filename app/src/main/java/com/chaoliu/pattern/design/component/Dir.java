package com.chaoliu.pattern.design.component;

import java.util.ArrayList;
import java.util.List;

public abstract class Dir {

    private String name;

    protected List<Dir> dirs = new ArrayList<>(  );

    public Dir(String name){
        this.name = name;
    }

    public abstract void addDir(Dir dir);

    public abstract void rmDir(Dir dir);

    public abstract void clear();

    public abstract void print();

    public abstract List<Dir> getFiles();

    public  String getName(){
        return name;
    }
}