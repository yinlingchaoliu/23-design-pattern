package com.chaoliu.pattern.design.agent.state;

/**
 * 代理类
 */
public class Lawyer implements ILawsuit {

    private ILawsuit mLawsuit;

    public Lawyer(ILawsuit mLawsuit) {
        this.mLawsuit = mLawsuit;
    }

    @Override
    public void submit() {

    }

    @Override
    public void burden() {

    }

    @Override
    public void defend() {

    }

    @Override
    public void finish() {

    }
}
