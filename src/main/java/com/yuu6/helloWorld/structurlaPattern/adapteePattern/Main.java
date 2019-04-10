package com.yuu6.helloWorld.structurlaPattern.adapteePattern;

import com.yuu6.helloWorld.structurlaPattern.decoratePattern.Say;

public class Main {
    public static void main(String[] args) {
        OldSay oldSay = new TellHelloWorld();
        Say say = new Adapter(oldSay);
        say.say();
    }
}
