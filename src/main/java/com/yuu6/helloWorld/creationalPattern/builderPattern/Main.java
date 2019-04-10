package com.yuu6.helloWorld.creationalPattern.builderPattern;

public class Main {
    public static void main(String[] args) {
        Builder builder = new BuilderHelloWorld();
        Director director = new Director(builder);
        Sentence sentence = director.construct();
        System.out.println(sentence);

//        Builder builder = new BuilderFellowMe();
//        Director director = new Director(builder);
//        Sentence sentence = director.construct();
//        System.out.println(sentence);
    }
}
