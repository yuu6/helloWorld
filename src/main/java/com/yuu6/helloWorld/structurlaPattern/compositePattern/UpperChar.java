package com.yuu6.helloWorld.structurlaPattern.compositePattern;

import com.yuu6.helloWorld.structurlaPattern.decoratePattern.Say;

public class UpperChar implements Say {
    private char a;

    public UpperChar(char a) {
        this.a = a;
    }

    public char getValue() {
        return a;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof UpperChar)) {
            return false;
        }
        return ((UpperChar) obj).getValue() == this.a;
    }

    @Override
    public void say() {
        System.out.print(Character.toUpperCase(a));
    }
}
