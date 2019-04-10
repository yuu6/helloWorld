package com.yuu6.helloWorld.behavioralPattern.IteratorPattern;

import com.yuu6.helloWorld.behavioralPattern.IteratorPattern.iterator.ConcreteIterator;
import com.yuu6.helloWorld.behavioralPattern.IteratorPattern.iterator.Iterator;

public class ConcreteSimpleCollection implements MyCollection {
    private Object[] objs;

    ConcreteSimpleCollection(Object[] objs){
        this.objs = objs;
    }

    @Override
    public Iterator createIterator() {
        return new ConcreteIterator(this.objs);
    }
}
