package com.chaoliu.pattern.design.visit;

import java.util.ArrayList;
import java.util.List;

public class Company {

    private List<IAccept> acceptList = new ArrayList<>(  );

    public Company(){
        acceptList.add( new Engineer( "小明","14","1000" ) );
        acceptList.add( new Engineer( "小张","10","12300" ) );
        acceptList.add( new Engineer( "小李","19","100450" ) );
        acceptList.add( new Engineer( "小孙","16","101100" ) );

        acceptList.add( new Manage( "张总","20","花钱项目" ) );
        acceptList.add( new Manage( "马云","10","五福项目" ) );
        acceptList.add( new Manage( "王总","20","卖大米项目" ) );
        acceptList.add( new Manage( "陈总","20","到天亮项目" ) );
    }

    public void showReport(IVisitor visitor){
        for (IAccept  accept :acceptList){
            accept.accept( visitor );
        }
    }

}
