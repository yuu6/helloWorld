package com.yuu6.helloWorld.structurlaPattern.bridgePattern;

import com.yuu6.helloWorld.structurlaPattern.bridgePattern.dimension.Color;
import com.yuu6.helloWorld.structurlaPattern.bridgePattern.dimension.Star;

public class Main {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";


    public static void main(String[] args) {
        Color color = new Color(ANSI_PURPLE);
        Star star = new Star(2);
        AbstractSay sayHelloWorld = new SayHelloWorld(color,star);
        sayHelloWorld.say();
    }
}
