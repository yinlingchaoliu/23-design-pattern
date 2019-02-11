package com.chaoliu.pattern.design.component;


public class TestMain {

    /**
     * 组合模式表示 : 整体-部分的关系
     * @param args 树型结构
     */
    public static void main(String[] args) {

        //构造一个目录对象表示C盘根目录
        Dir diskC = new Folder("C");

        //C盘根目录下有一个文件Log.txt
        diskC.addDir(new File("Log.txt"));

        //C盘根目录下有三个目录Windows、PerfLogs、Program File
        Dir dirWin = new Folder("Windows");

        //Windows目录下有文件explorer.exe
        dirWin.addDir(new File("explorer.exe"));
        diskC.addDir(dirWin);

        //打印出文件结构
        diskC.print();

    }

}
