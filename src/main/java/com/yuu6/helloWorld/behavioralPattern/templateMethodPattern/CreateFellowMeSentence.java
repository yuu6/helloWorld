package com.yuu6.helloWorld.behavioralPattern.templateMethodPattern;

public class CreateFellowMeSentence extends AbstractCreateSentence {
    @Override
    void setSentenceAction() {
        sentence.setAction("fellow ");
    }

    @Override
    void setSentenceObject() {
        sentence.setObject("me!");
    }
}
