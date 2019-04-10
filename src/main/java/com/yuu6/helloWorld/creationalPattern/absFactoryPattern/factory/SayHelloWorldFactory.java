package com.yuu6.helloWorld.creationalPattern.absFactoryPattern.factory;


import com.yuu6.helloWorld.creationalPattern.absFactoryPattern.Say;
import com.yuu6.helloWorld.creationalPattern.absFactoryPattern.SayHelloWorld;

public class SayHelloWorldFactory implements SayFactory {

    @Override
    public Say creatSay() {
        return new SayHelloWorld();
    }
}
