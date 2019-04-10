package com.yuu6.helloWorld.behavioralPattern.chainOfResponsibilityPattern;

public class Main {
    public static void main(String[] args) {
        DeletePointWordHandler deletePointWordHandler = new DeletePointWordHandler();
        ToUpperWordHandler toUpperWordHandler = new ToUpperWordHandler(deletePointWordHandler);
        String res = toUpperWordHandler.handleWord("hello.&* world!");
        System.out.println(res);
    }
}
