package com.yuu6.helloWorld.structurlaPattern.flyweightPattern;

import com.yuu6.helloWorld.structurlaPattern.decoratePattern.Say;

import java.util.HashMap;

public class SayHelloWorldFactory {

    private HashMap<String, Say> hashMap = new HashMap<>();

    public Say getSayHelloWorld(String key) {
        if (hashMap.containsKey(key)) {
            return hashMap.get(key);
        } else {
            Say sayHelloWorld = new SayHelloWorld();
            hashMap.put(key, sayHelloWorld);
            return sayHelloWorld;
        }
    }

}
