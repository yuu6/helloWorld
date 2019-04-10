package com.yuu6.helloWorld.structurlaPattern.flyweightPattern;

import com.yuu6.helloWorld.structurlaPattern.decoratePattern.Say;

public class SayHelloWorld implements Say {
    @Override
    public void say() {
        System.out.println("hello world!");
    }
}
