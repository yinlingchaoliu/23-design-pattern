package com.chaoliu.pattern.design.media;

/**
 * CPU
 */
public class CPU extends Colleague {

    private String branch;

    public CPU(Mediaor mediaor) {
        super( mediaor );
    }

    @Override
    public void action() {
        mediaor.change( this );
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public void loadCPU(){
        System.out.println( "CPU" + branch );
    }

}
