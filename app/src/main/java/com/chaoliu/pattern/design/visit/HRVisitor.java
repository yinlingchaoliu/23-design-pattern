package com.chaoliu.pattern.design.visit;

/**
 * 访问者
 */
public class HRVisitor extends Visitor{

    @Override
    public Kind kind() {
        return Kind.HR;
    }
}