package com.yuu6.helloWorld.creationalPattern.absFactoryPattern;


public class SayHelloWorld implements Say {
    @Override
    public void say() {
        System.out.println("hello world!");
    }
}
