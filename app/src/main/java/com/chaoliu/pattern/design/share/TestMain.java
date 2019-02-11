package com.chaoliu.pattern.design.share;

/**
 *
 * 享元模式
 * eg: message , 线程池，连接池
 * 共享池
 *
 * 大大减少应用程序创建的对象，降低程序内存的占用，增强程序的性能
 *
 */
public class TestMain {

    public static void main(String[] args){

        Ticket ticket01 = TicketFactory.getTicket("北京", "青岛");
        ticket01.showTicketInfo("上铺");

        Ticket ticket02 = TicketFactory.getTicket("北京", "青岛");
        ticket02.showTicketInfo("下铺");

        Ticket ticket03 = TicketFactory.getTicket("北京", "西安");
        ticket03.showTicketInfo("坐票");

    }

}
