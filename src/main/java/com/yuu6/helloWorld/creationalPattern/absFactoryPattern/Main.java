package com.yuu6.helloWorld.creationalPattern.absFactoryPattern;


import com.yuu6.helloWorld.creationalPattern.absFactoryPattern.factory.SayFactory;
import com.yuu6.helloWorld.creationalPattern.absFactoryPattern.factory.SayHelloWorldFactory;

public class Main {
    public static void main(String[] args) {
        SayFactory sayFactory = new SayHelloWorldFactory();
//        SayFactory sayFactory = new SayFellowMeFactory();
        Say say = sayFactory.creatSay();
        say.say();
    }
}
