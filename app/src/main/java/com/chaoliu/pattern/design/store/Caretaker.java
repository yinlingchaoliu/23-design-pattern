package com.chaoliu.pattern.design.store;

/**
 * 备忘录模式
 */
public class Caretaker implements IMemotoStore{

    private Memoto memoto = new Memoto();

    @Override
    public void store(Memoto memoto) {
        memoto.setAge( memoto.getAge());
        memoto.setName( memoto.getName() );
        memoto.setSex( memoto.getSex() );
    }

    @Override
    public Memoto restore() {
        return memoto;
    }

}
