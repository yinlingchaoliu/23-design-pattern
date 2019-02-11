package com.chaoliu.pattern.design.decorate;

public class PersonWrapper extends Person{

    private Person mPerson;

    public PersonWrapper(Person mPerson) {
        this.mPerson = mPerson;
    }

    @Override
    public void dressed() {
        mPerson.dressed();
    }

}