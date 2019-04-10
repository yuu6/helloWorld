package com.yuu6.helloWorld.structurlaPattern.proxyPattern;

import com.yuu6.helloWorld.structurlaPattern.decoratePattern.Say;

public class SayHelloWorld implements Say {
    @Override
    public void say() {
        System.out.print("hello world!");
    }
}
