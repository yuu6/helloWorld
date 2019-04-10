package com.yuu6.helloWorld.structurlaPattern.decoratePattern;

public class Main {
    public static void main(String[] args) {
        Say say = new SayHelloWorld();
        Decorate colorDecorate = new Decorate(say);
        colorDecorate.say();
    }
}
