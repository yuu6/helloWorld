package com.yuu6.helloWorld.behavioralPattern.statePattern.state;

import com.yuu6.helloWorld.behavioralPattern.statePattern.Context;

public class GreenState extends State {

    @Override
    public void greenPrint(char a) {
        System.out.print(super.context.ANSI_GREEN + a);
    }

    @Override
    public void redPrint(char a) {
        super.context.setCurrentState(Context.redState);
        super.context.redPrint(a);
    }

    @Override
    public void whitePrint(char a) {
        super.context.setCurrentState(Context.whiteState);
        super.context.whitePrint(a);
    }
}
