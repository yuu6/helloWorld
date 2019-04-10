package com.yuu6.helloWorld.creationalPattern.factoryMethodPattern.factory;


import com.yuu6.helloWorld.creationalPattern.absFactoryPattern.Say;
import com.yuu6.helloWorld.creationalPattern.absFactoryPattern.SayFellowMe;

public class SayFellowMeFactory extends SayFactory {

    public Say creatSay() {
        return new SayFellowMe();
    }
}
