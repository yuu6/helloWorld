package com.yuu6.helloWorld.behavioralPattern.commandPattern;

import com.yuu6.helloWorld.behavioralPattern.commandPattern.Command.Command;
import com.yuu6.helloWorld.behavioralPattern.commandPattern.Command.ConcreteCommand;
import com.yuu6.helloWorld.behavioralPattern.commandPattern.Invoker.SayInvoker;
import com.yuu6.helloWorld.behavioralPattern.commandPattern.Receiver.PrintHelloWorld;
import com.yuu6.helloWorld.behavioralPattern.commandPattern.Receiver.Receiver;
import com.yuu6.helloWorld.structurlaPattern.decoratePattern.Say;

public class Main {
    public static void main(String[] args) {
        Receiver receiver = new PrintHelloWorld();
        Command printCommand = new ConcreteCommand(receiver);
        Say sayHelloWorld = new SayInvoker(printCommand);

        sayHelloWorld.say();
    }
}
