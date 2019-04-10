package com.yuu6.helloWorld.behavioralPattern.mediatorPattern.waiter;

import com.yuu6.helloWorld.behavioralPattern.mediatorPattern.Mediator;

/**
 * 服务员
 */

public abstract class Waiter{
    public String country;
    private Mediator mediator;

    Waiter(String country) {
        this.country = country;
    }

    public abstract void say();

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }
}
