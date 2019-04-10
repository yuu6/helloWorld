package com.yuu6.helloWorld.creationalPattern.builderPattern;

public class BuilderHelloWorld implements Builder {

    Sentence sentence = new Sentence();

    @Override
    public void sayWhat() {
        sentence.setAction("hello ");
    }

    @Override
    public void sayToWho() {
        sentence.setObject("world!");
    }

    @Override
    public Sentence getSentence() {
        return sentence;
    }
}
