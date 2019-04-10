package com.yuu6.helloWorld.behavioralPattern.strategyPattern;

public class Main {
    public static void main(String[] args) {
        SayHelloWorld sayHelloWorld = new SayHelloWorld();
        sayHelloWorld.setWorldHello("!dlrow olleh");
//        sayHelloWorld.setUtil(new ReverseStringWithStringBuilder());
        sayHelloWorld.setUtil(new ReverseStringWithCharArray());
        sayHelloWorld.getHelloWorld();
    }
}
