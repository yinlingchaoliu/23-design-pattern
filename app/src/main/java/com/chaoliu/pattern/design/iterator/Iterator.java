package com.chaoliu.pattern.design.iterator;

/**
 * 迭代器模式
 */
public interface Iterator<T> {

    /**
     * 是否有下一个元素
     * @return
     */
    boolean hasNext();

    /**
     * 返回当前元素，并将位置移至下一位
     */
    T next();

}
