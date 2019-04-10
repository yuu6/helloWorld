package com.yuu6.helloWorld.behavioralPattern.templateMethodPattern;

public class Sentence {

    // 动作
    private String action;
    // 对象
    private String object;

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getObject() {
        return object;
    }

    public void setObject(String object) {
        this.object = object;
    }

    @Override
    public String toString() {
        return action + object;
    }
}
