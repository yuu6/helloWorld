package com.yuu6.helloWorld.creationalPattern.factoryMethodPattern.factory;


import com.yuu6.helloWorld.creationalPattern.absFactoryPattern.Say;

public abstract class SayFactory{

    protected Say say;

    public abstract Say creatSay();

    public void say(){
        this.say = this.creatSay();
        say.say();
    }
}
