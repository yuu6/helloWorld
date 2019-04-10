package com.yuu6.helloWorld.behavioralPattern.templateMethodPattern;

public class CreateHelloWorldSentence extends AbstractCreateSentence {
    @Override
    void setSentenceAction() {
        sentence.setAction("hello ");
    }

    @Override
    void setSentenceObject() {
        sentence.setObject("world!");
    }
}
