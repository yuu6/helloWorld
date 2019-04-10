package com.yuu6.helloWorld.behavioralPattern.observerPattern;

public class MyChar {
    private char mychar;
    private CharGroup charGroup;


    public MyChar(char a,CharGroup charGroup){
        mychar = a;
        this.charGroup = charGroup;
    }
    public void myNotify(){
        this.charGroup.myNotify(this);
    }
    public void print(){
        System.out.print(mychar);
    }
}
