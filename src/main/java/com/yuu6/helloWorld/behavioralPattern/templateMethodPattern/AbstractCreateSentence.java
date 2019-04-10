package com.yuu6.helloWorld.behavioralPattern.templateMethodPattern;

public abstract class AbstractCreateSentence {
    Sentence sentence = new Sentence();
    public AbstractCreateSentence(){
        setSentenceAction();
        setSentenceObject();
    }

    public Sentence getSentence(){
        return sentence;
    }

    abstract void setSentenceAction();

    abstract  void setSentenceObject();

}
