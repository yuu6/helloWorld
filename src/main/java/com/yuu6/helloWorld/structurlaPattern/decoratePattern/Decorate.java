package com.yuu6.helloWorld.structurlaPattern.decoratePattern;

public class Decorate implements Say {

    private Say say;

    Decorate(Say say) {
        this.say = say;
    }

    @Override
    public void say() {
        System.out.println("=========");
        say.say();
        System.out.println("=========");

    }
}
