package com.yuu6.helloWorld.behavioralPattern.chainOfResponsibilityPattern;

public class ToUpperWordHandler extends WordHandler {
    public ToUpperWordHandler() {}

    public ToUpperWordHandler(WordHandler successor) {
        super(successor);
    }

    @Override
    public String handleWord(String str) {
        if (successor != null) {
            return successor.handleWord(str.toUpperCase());
        } else {
            return str.toUpperCase();
        }
    }
}
