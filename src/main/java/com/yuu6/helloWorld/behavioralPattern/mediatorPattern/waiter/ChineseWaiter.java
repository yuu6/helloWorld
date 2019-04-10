package com.yuu6.helloWorld.behavioralPattern.mediatorPattern.waiter;

public class ChineseWaiter extends Waiter {

    public ChineseWaiter() {
        super("chinese");
    }

    @Override
    public void say() {
        System.out.println("世界，你好");
    }

}
