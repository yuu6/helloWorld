package com.yuu6.helloWorld.structurlaPattern.bridgePattern;

import com.yuu6.helloWorld.structurlaPattern.bridgePattern.dimension.Color;
import com.yuu6.helloWorld.structurlaPattern.bridgePattern.dimension.Star;

public abstract class AbstractSay {

    protected Color color1;
    protected Star star;

    public AbstractSay(Color c1, Star s1){
        this.color1 = c1;
        this.star = s1;
    }

    public abstract void say();

}
