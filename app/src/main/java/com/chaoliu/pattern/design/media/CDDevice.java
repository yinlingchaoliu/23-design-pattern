package com.chaoliu.pattern.design.media;

/**
 * Cd设备
 */
public class CDDevice extends Colleague {
    private String cd;

    public CDDevice(Mediaor mediaor) {
        super( mediaor );
    }

    @Override
    public void action() {
        mediaor.change( this );
    }

    public void setCd(String cd) {
        this.cd = cd;
    }

    public void loadCD(){
        System.out.println( "load CD" + cd );
    }

}