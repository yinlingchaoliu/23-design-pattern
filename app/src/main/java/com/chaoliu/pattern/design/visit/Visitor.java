package com.chaoliu.pattern.design.visit;

/**
 * 访问者模板
 */
public abstract class Visitor implements IVisitor{
    @Override
    public void visit(IAccept accept) {
        accept.showInfo();
    }
}
