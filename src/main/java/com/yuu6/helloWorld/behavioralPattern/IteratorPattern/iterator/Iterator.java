package com.yuu6.helloWorld.behavioralPattern.IteratorPattern.iterator;

public interface Iterator {
    public void first();

    public Object next();

    public boolean hasNext();

    public Object currentItem();
}
