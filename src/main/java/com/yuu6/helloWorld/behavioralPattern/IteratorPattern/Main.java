package com.yuu6.helloWorld.behavioralPattern.IteratorPattern;

import com.yuu6.helloWorld.behavioralPattern.IteratorPattern.iterator.Iterator;

public class Main {
    public static void main(String[] args) {
        Object[] chars = {'h','e','l','l','o',' ','w','o','r','l','d','!'};
        ConcreteSimpleCollection concreteSimpleCollection = new ConcreteSimpleCollection(chars);

        Iterator iterator = concreteSimpleCollection.createIterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next());
        }
    }
}
