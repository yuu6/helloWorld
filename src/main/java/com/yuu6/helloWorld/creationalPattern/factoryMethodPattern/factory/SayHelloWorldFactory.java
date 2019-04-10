package com.yuu6.helloWorld.creationalPattern.factoryMethodPattern.factory;


import com.yuu6.helloWorld.creationalPattern.absFactoryPattern.Say;
import com.yuu6.helloWorld.creationalPattern.absFactoryPattern.SayHelloWorld;

public class SayHelloWorldFactory extends SayFactory {

    @Override
    public Say creatSay() {
        return new SayHelloWorld();
    }
}
