package com.chaoliu.pattern.design.media;

/**
 * 中介者模式
 * 多对多转化为一对多
 */
public class MainBoard implements Mediaor {

    private CDDevice cdDevice; //光驱设备
    private CPU cpu; //CPU
    private SoundCard soundCard; //声卡设备

    public void setCdDevice(CDDevice cdDevice) {
        this.cdDevice = cdDevice;
    }

    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }

    public void setSoundCard(SoundCard soundCard) {
        this.soundCard = soundCard;
    }

    @Override
    public void change(Colleague colleague) {
        if (colleague instanceof CDDevice) {
            ((CDDevice) colleague).loadCD();
        } else if (colleague instanceof CPU) {
            ((CPU) colleague).loadCPU();
        } else if (colleague instanceof SoundCard) {
            ((SoundCard) colleague).loadSoundCard();
        }
    }

}