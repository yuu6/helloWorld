package com.yuu6.helloWorld.creationalPattern.builderPattern;

public class Director {
    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public Sentence construct() {
        builder.sayWhat();
        builder.sayToWho();
        return builder.getSentence();
    }
}
