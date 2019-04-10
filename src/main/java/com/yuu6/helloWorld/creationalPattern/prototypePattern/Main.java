package com.yuu6.helloWorld.creationalPattern.prototypePattern;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        SayHelloWorld sayHelloWorld = new SayHelloWorld();
//        SayHelloWorld sayHelloWorld1 = sayHelloWorld.deepCopy();
//        System.out.println(sayHelloWorld == sayHelloWorld1);
        sayHelloWorld.say();
    }
}
