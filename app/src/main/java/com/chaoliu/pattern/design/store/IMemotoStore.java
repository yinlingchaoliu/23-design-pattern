package com.chaoliu.pattern.design.store;

public interface IMemotoStore {
    void store(Memoto memoto);
    Memoto restore();
}
