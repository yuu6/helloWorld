package com.yuu6.helloWorld.behavioralPattern.templateMethodPattern;

public class Main {
    public static void main(String[] args) {
        AbstractCreateSentence sentence = new CreateHelloWorldSentence();
//        AbstractCreateSentence sentence = new CreateFellowMeSentence();
        System.out.println(sentence.getSentence());
    }
}
