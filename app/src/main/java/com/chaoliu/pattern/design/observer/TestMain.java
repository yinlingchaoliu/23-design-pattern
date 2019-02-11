package com.chaoliu.pattern.design.observer;

public class TestMain {

    public static void main(String[] args){

        User user1 = new User( "小米" );
        User user2 = new User( "小名" );
        User user3 = new User( "小明" );

        Tv tv = new Tv();
        tv.register( user1 );
        tv.register( user2 );
        tv.register( user3 );

        tv.notify( "甄嬛来了" );
    }

}
