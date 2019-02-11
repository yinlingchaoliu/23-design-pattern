package com.chaoliu.pattern.design.observer;

import java.util.ArrayList;
import java.util.List;

public class Tv implements IObservable {

    List<IObserver> list = new ArrayList<>();

    @Override
    public void register(IObserver observer) {
        list.add( observer );
    }

    @Override
    public void notify(String msg) {
        for (IObserver observer : list) {
            observer.update( msg );
        }
    }
}
