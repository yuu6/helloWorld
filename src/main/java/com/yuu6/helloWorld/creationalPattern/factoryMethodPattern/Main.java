package com.yuu6.helloWorld.creationalPattern.factoryMethodPattern;


import com.yuu6.helloWorld.creationalPattern.factoryMethodPattern.factory.SayFactory;
import com.yuu6.helloWorld.creationalPattern.factoryMethodPattern.factory.SayHelloWorldFactory;

public class Main {
    public static void main(String[] args) {
        SayFactory sayFactory = new SayHelloWorldFactory();
//        SayFactory sayFactory = new SayFellowMeFactory();
        sayFactory.say();
    }
}
