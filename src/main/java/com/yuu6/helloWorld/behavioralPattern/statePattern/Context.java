package com.yuu6.helloWorld.behavioralPattern.statePattern;

import com.yuu6.helloWorld.behavioralPattern.statePattern.state.GreenState;
import com.yuu6.helloWorld.behavioralPattern.statePattern.state.RedState;
import com.yuu6.helloWorld.behavioralPattern.statePattern.state.State;
import com.yuu6.helloWorld.behavioralPattern.statePattern.state.WhiteState;

public class Context {
    public final static State greenState = new GreenState();
    public final static State redState = new RedState();
    public final static State whiteState = new WhiteState();

    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_WHITE = "\u001B[37m";


    private State currentState;

    public State getCurrentState(){
        return currentState;
    }

    public void setCurrentState(State currentState) {
        this.currentState = currentState;
        this.currentState.setContext(this);
    }

    public void greenPrint(char a){
        this.currentState.greenPrint(a);
    }
    public void redPrint(char a){
        this.currentState.redPrint(a);
    }
    public void whitePrint(char a){
        this.currentState.whitePrint(a);
    }
}
