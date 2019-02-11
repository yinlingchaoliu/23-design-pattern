package com.chaoliu.pattern.design.media;

/**
 * 声卡
 */
public class SoundCard extends Colleague {

    private String sound;

    public SoundCard(Mediaor mediaor) {
        super( mediaor );
    }

    @Override
    public void action() {
        mediaor.change( this );
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public void loadSoundCard(){
        System.out.println( "load sound" + sound );
    }

}