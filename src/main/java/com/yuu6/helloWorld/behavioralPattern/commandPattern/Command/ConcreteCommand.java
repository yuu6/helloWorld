package com.yuu6.helloWorld.behavioralPattern.commandPattern.Command;


import com.yuu6.helloWorld.behavioralPattern.commandPattern.Receiver.Receiver;

public class ConcreteCommand extends Command{
    private Receiver receiver;

    public ConcreteCommand(Receiver receiver){
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.print();
    }
}
