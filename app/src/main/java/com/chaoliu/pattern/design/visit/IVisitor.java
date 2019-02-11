package com.chaoliu.pattern.design.visit;

/**
 * 访问者
 */
public interface IVisitor<ACCEPT extends IAccept> {

    void visit(ACCEPT accept);

    Kind kind(); //访问者类型

}
