package com.yuu6.helloWorld.behavioralPattern.commandPattern.Invoker;

import com.yuu6.helloWorld.behavioralPattern.commandPattern.Command.Command;
import com.yuu6.helloWorld.structurlaPattern.decoratePattern.Say;

public class SayInvoker implements Say {
    private Command command;

    public SayInvoker(Command command){
        this.command = command;
    }
    @Override
    public void say() {
        command.execute();
    }
}
