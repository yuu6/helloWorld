package com.yuu6.helloWorld.structurlaPattern.flyweightPattern;

import com.yuu6.helloWorld.structurlaPattern.decoratePattern.Say;

public class Main {
    public static void main(String[] args) {
        SayHelloWorldFactory shwf = new SayHelloWorldFactory();
        Say sayHelloWorld = shwf.getSayHelloWorld("helloworld");
        sayHelloWorld.say();
        Say sayHelloWorld2 = shwf.getSayHelloWorld("helloworld");
        sayHelloWorld2.say();
        System.out.println(sayHelloWorld == sayHelloWorld2);
    }
}
