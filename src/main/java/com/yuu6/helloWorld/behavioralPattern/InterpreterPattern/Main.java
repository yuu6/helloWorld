package com.yuu6.helloWorld.behavioralPattern.InterpreterPattern;

public class Main {
    public static void main(String[] args) {
        Experssion experssion = new LoopExpression();
        experssion.interpret("LOOP 2 hello_world LOOP 3 ni_hao");
    }
}
