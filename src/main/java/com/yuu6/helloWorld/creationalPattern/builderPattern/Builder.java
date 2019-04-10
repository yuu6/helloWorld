package com.yuu6.helloWorld.creationalPattern.builderPattern;

public interface Builder {
    public void sayWhat();
    public void sayToWho();

    public Sentence getSentence();
}
