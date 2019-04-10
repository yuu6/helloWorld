package com.yuu6.helloWorld.behavioralPattern.chainOfResponsibilityPattern;

public abstract class WordHandler {
    public WordHandler successor;

    public WordHandler() {}

    public WordHandler(WordHandler successor) {
        this.successor = successor;
    }

    public abstract String handleWord(String str);
}
