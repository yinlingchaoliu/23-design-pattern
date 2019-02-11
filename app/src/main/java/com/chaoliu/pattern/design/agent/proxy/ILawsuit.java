package com.chaoliu.pattern.design.agent.proxy;

public interface ILawsuit {

    //提交申请
    void submit();

    //举证
    void burden();

    //辩护
    void defend();

    //诉讼完成
    void finish();

}