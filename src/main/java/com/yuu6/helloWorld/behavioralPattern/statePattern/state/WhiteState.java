package com.yuu6.helloWorld.behavioralPattern.statePattern.state;

import com.yuu6.helloWorld.behavioralPattern.statePattern.Context;

public class WhiteState extends State{

    @Override
    public void whitePrint(char a) {
        System.out.print(super.context.ANSI_WHITE + a);
    }

    @Override
    public void greenPrint(char a) {
        super.context.setCurrentState(Context.greenState);
        super.context.greenPrint(a);
    }

    @Override
    public void redPrint(char a) {
        super.context.setCurrentState(Context.redState);
        super.context.redPrint(a);
    }
}
