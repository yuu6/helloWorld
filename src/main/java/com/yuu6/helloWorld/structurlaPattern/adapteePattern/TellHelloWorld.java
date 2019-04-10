package com.yuu6.helloWorld.structurlaPattern.adapteePattern;

/**
 * 以前的过失的接口的实现类
 */
public class TellHelloWorld implements OldSay {
    @Override
    public void oldSay() {
        System.out.println("hello world!");
    }
}
