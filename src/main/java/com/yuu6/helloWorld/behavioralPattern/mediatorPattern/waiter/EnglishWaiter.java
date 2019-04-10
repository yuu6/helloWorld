package com.yuu6.helloWorld.behavioralPattern.mediatorPattern.waiter;

public class EnglishWaiter extends Waiter {

    public EnglishWaiter() {
        super("english");
    }

    @Override
    public void say() {
        System.out.println("hello world!");
    }

}
