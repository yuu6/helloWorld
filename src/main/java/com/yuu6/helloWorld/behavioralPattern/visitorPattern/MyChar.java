package com.yuu6.helloWorld.behavioralPattern.visitorPattern;

import com.yuu6.helloWorld.behavioralPattern.visitorPattern.handle.Handler;

public class MyChar {
    private char a;

    public MyChar(char a){
        this.a = a;
    }

    public void handle(Handler handler){
        handler.visit(this);
    }

    public char getA() {
        return a;
    }

    public void setA(char a) {
        this.a = a;
    }
}
