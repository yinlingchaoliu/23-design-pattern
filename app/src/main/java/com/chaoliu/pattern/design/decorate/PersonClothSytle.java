package com.chaoliu.pattern.design.decorate;

public class PersonClothSytle extends PersonWrapper{

    public PersonClothSytle(Person mPerson) {
        super( mPerson );
    }

    /**
     * 穿牛仔裤
     */
    private void dressJean(){
        System.out.println("穿牛仔裤");
    }

    /**
     * 穿鞋子
     */
    private void dressShoes(){
        System.out.println("穿鞋子 ");
    }

    @Override
    public void dressed() {
        super.dressed();
        dressJean();
        dressShoes();
    }
}
