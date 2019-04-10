package com.yuu6.helloWorld.behavioralPattern.mementoPattern;

public class Main {
    public static void main(String[] args) {
        Talk talk = new Talk();
        talk.setSentence("hello world 1");
        talk.say();

        Memonto memonto = talk.save();
        talk.setSentence("hello world 2");
        talk.say();

        talk.restore(memonto);
        talk.say();
    }
}
