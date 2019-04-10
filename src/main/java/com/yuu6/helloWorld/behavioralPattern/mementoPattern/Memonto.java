package com.yuu6.helloWorld.behavioralPattern.mementoPattern;

public class Memonto {

    private String sentence;
    Memonto(String str){
        this.sentence = str;
    }


    public String getSentence() {
        return sentence;
    }

    public void setSentence(String sentence) {
        this.sentence = sentence;
    }
}
