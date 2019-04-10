package com.yuu6.helloWorld.behavioralPattern.statePattern;

import com.yuu6.helloWorld.behavioralPattern.statePattern.state.GreenState;

public class Main {
    public static void main(String[] args) {
        Context context = new Context();
        context.setCurrentState(new GreenState());

        context.redPrint('h');
        context.greenPrint('e');
        context.whitePrint('l');
        context.greenPrint('l');
        context.whitePrint('o');
        context.redPrint(' ');
        context.greenPrint('w');
        context.redPrint('o');
        context.whitePrint('r');
        context.redPrint('l');
        context.whitePrint('d');
        context.whitePrint('!');
    }
}
