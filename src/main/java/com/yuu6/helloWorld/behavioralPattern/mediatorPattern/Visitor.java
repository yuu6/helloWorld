package com.yuu6.helloWorld.behavioralPattern.mediatorPattern;

/**
 * 游客
 */
public class Visitor {

    private Mediator mediator;
    private String contury;

    public Visitor(String contury){
        this.contury = contury;
    }
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public void comeIn(){
        mediator.sayHello(this.contury);
    }
}
