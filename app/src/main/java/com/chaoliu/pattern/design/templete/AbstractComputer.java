package com.chaoliu.pattern.design.templete;

/**
 *
 * 模板方法
 * 封装不变部分，扩展可变部分。
 * 提取公共部分代码，便于维护
 *
 */
public abstract class AbstractComputer implements IComputer {

    //下面是模板方法，定义为final，子类不能覆盖此方法
    //固定策略不能轻易改变
    @Override
    public final void startUp() {
        System.out.println( "--------开机 START--------" );
        powerOn();
        checkHardware();
        loadOS();
        if (isLogin()) {
            login();
        }
        System.out.println( "-------- 开机 END --------" );
    }
}