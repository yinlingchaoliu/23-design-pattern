package com.chaoliu.pattern.design.media;

public abstract class Colleague {

    protected Mediaor mediaor;

    public Colleague(Mediaor mediaor) {
        this.mediaor = mediaor;
    }

    public abstract void action();
}
