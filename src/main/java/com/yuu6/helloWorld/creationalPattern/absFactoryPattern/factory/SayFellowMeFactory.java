package com.yuu6.helloWorld.creationalPattern.absFactoryPattern.factory;


import com.yuu6.helloWorld.creationalPattern.absFactoryPattern.Say;
import com.yuu6.helloWorld.creationalPattern.absFactoryPattern.SayFellowMe;

public class SayFellowMeFactory implements SayFactory {

    @Override
    public Say creatSay() {
        return new SayFellowMe();
    }
}
