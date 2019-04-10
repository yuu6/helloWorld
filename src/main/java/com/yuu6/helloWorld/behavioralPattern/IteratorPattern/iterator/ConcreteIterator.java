package com.yuu6.helloWorld.behavioralPattern.IteratorPattern.iterator;

/**
 * 正向顺序遍历
 *
 */
public class ConcreteIterator implements Iterator {
    private Object[] objs;

    private int cursor;

    public ConcreteIterator(Object[] objs) {
        this.objs = objs;
    }

    @Override
    public void first() {
        cursor = 0;
    }

    @Override
    public Object next() {
        if (cursor < objs.length) {
            return objs[cursor++];
        }
        return -1;
    }

    @Override
    public boolean hasNext() {
        return cursor < objs.length;
    }

    @Override
    public Object currentItem() {
        return objs[cursor];
    }
}
