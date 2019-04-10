package com.yuu6.helloWorld.creationalPattern.builderPattern;

public class BuilderFellowMe implements Builder {

    Sentence sentence = new Sentence();

    @Override
    public void sayWhat() {
        sentence.setAction("fellow ");
    }

    @Override
    public void sayToWho() {
        sentence.setObject("me!");
    }

    @Override
    public Sentence getSentence() {
        return sentence;
    }
}
