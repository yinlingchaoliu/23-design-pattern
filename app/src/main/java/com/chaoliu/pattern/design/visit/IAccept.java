package com.chaoliu.pattern.design.visit;

/**
 * 受访者
 */
public interface IAccept {
    void accept(IVisitor visit);
    void showInfo();
}
