package com.yuu6.helloWorld.behavioralPattern.mediatorPattern.waiter;

public class GermanWaiter extends Waiter {

    public GermanWaiter() {
        super("german");
    }

    @Override
    public void say() {
        System.out.println("Hallo Welt");
    }

}
