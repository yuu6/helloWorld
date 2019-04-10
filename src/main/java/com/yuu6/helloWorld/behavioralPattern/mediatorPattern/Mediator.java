package com.yuu6.helloWorld.behavioralPattern.mediatorPattern;

import com.yuu6.helloWorld.behavioralPattern.mediatorPattern.waiter.Waiter;

import java.util.ArrayList;

public class Mediator {
    ArrayList<Waiter> waiters = new ArrayList<>();
    ArrayList<Visitor> persons = new ArrayList<>();

    public void sayHello(String country){
        for (int i = 0; i < waiters.size(); i++) {
            if (country.equals(waiters.get(i).country))
                waiters.get(i).say();
        }
    }

    public void addWaiter(Waiter waiter){
        int lens = waiters.size();
        waiters.add(lens,waiter);
    }


    public void addVisitor(Visitor person){
        int lens = persons.size();
        persons.add(lens,person);
    }




}
