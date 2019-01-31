package com.chaoliu.pattern.design.strategy;

/**
 * 策略模式
 * 关注点在于行为的选择
 * 解决swich-case
 */
public class TestMain {

    public static void main(String[] args) {

        Price price = new Price( new PrimaryMemberStrategy() );
        price.quote( 100 );

        Price price1 = new Price( new IntermediateMemberStrategy() );
        price.quote( 100 );

        Price price2 = new Price( new AdvancedMemberStrategy() );
        price.quote( 100 );

    }

}
