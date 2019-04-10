package com.yuu6.helloWorld.behavioralPattern.chainOfResponsibilityPattern;

public class DeletePointWordHandler extends WordHandler {
    public DeletePointWordHandler() {}

    public DeletePointWordHandler(WordHandler successor) {
        super(successor);
    }

    @Override
    public String handleWord(String str) {
        char[] chars = str.toCharArray();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] < 'Z' && chars[i] > 'A' || chars[i] == ' ') {
                stringBuilder.append(chars[i]);
            }
        }
        if (successor != null) {
            return successor.handleWord(stringBuilder.toString());
        } else {
            return stringBuilder.toString();
        }
    }
}
