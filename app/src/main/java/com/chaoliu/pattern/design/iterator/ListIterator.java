package com.chaoliu.pattern.design.iterator;

import java.util.List;

/**
 * list列表迭代
 * @param <T>
 */
public class ListIterator<T> implements Iterator<T>{

    private List<T> array;
    private int position;

    public ListIterator(List<T> list){
        this.array = list;
        position = 0;
    }

    @Override
    public boolean hasNext() {
        return !(position > array.size() -1 || array.get( position ) == null);
    }

    @Override
    public T next() {
        T element = array.get( position );
        position ++ ;
        return element;
    }

}
