package com.yuu6.helloWorld.structurlaPattern.compositePattern;

import com.yuu6.helloWorld.structurlaPattern.decoratePattern.Say;

public class LowerChar implements Say {
    private char a;

    public LowerChar(char a) {
        this.a = a;
    }

    public char getValue() {
        return a;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof LowerChar)) {
            return false;
        }
        return ((LowerChar) obj).getValue() == this.a;
    }

    @Override
    public void say() {
        System.out.print(Character.toLowerCase(a));
    }
}
