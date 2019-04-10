package com.yuu6.helloWorld.structurlaPattern.proxyPattern;

import com.yuu6.helloWorld.structurlaPattern.decoratePattern.Say;

public class Main {
    public static void main(String[] args) {
        ProxyHelloWorld proxy = new ProxyHelloWorld();
        Say say = (Say) proxy.bind(new SayHelloWorld());
        say.say();
    }
}
