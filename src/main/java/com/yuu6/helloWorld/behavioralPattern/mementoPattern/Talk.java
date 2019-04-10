package com.yuu6.helloWorld.behavioralPattern.mementoPattern;

import com.yuu6.helloWorld.structurlaPattern.decoratePattern.Say;

public class Talk implements Say {
    private String sentence;


    public String getSentence() {
        return sentence;
    }

    public void setSentence(String sentence) {
        this.sentence = sentence;
    }

    public Memonto save(){
        return new Memonto(sentence);
    }

    public void restore(Memonto mem){
        this.sentence = mem.getSentence();
    }


    @Override
    public void say() {
        System.out.println(sentence);
    }
}
