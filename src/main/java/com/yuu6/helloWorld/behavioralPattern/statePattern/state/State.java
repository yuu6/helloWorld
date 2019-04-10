package com.yuu6.helloWorld.behavioralPattern.statePattern.state;

import com.yuu6.helloWorld.behavioralPattern.statePattern.Context;

/**
 * 定义状态的抽象类
 */
public abstract class State {
    protected Context context;

    public void setContext(Context context){
        this.context = context;
    }

    public abstract void greenPrint(char a);
    public abstract void redPrint(char a);
    public abstract void whitePrint(char a);

}
