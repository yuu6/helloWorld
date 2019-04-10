package com.yuu6.helloWorld.behavioralPattern.commandPattern.Receiver;

public class PrintHelloWorld implements Receiver {

    @Override
    public void print() {
        System.out.println("hello world!");
    }
}