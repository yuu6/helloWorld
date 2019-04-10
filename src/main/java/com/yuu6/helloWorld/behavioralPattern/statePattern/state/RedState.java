package com.yuu6.helloWorld.behavioralPattern.statePattern.state;

import com.yuu6.helloWorld.behavioralPattern.statePattern.Context;

public class RedState extends State{

    @Override
    public void redPrint(char a) {
        System.out.print(super.context.ANSI_RED + a);
    }

    @Override
    public void greenPrint(char a) {
        super.context.setCurrentState(Context.greenState);
        super.context.greenPrint(a);
    }

    @Override
    public void whitePrint(char a) {
        super.context.setCurrentState(Context.whiteState);
        super.context.whitePrint(a);
    }
}
