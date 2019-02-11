package com.chaoliu.pattern.design.visit;

public class CEOVisitor extends Visitor{

    @Override
    public Kind kind() {
        return Kind.CEO;
    }

}