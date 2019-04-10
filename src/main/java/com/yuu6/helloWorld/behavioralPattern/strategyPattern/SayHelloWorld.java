package com.yuu6.helloWorld.behavioralPattern.strategyPattern;

public class SayHelloWorld {

    private String reverseHelloWorld;
    private ReverseStringUtil reverseStringUtil;
    public void setWorldHello(String str){
        this.reverseHelloWorld = str;
    }
    public void setUtil(ReverseStringUtil reverseStringUtil){
        reverseHelloWorld = reverseStringUtil.reverse(reverseHelloWorld);
    }

    public void getHelloWorld(){
        System.out.println(reverseHelloWorld);
    }
}
