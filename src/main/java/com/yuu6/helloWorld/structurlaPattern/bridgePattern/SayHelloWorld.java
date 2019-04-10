package com.yuu6.helloWorld.structurlaPattern.bridgePattern;


import com.yuu6.helloWorld.structurlaPattern.bridgePattern.dimension.Color;
import com.yuu6.helloWorld.structurlaPattern.bridgePattern.dimension.Star;

public class SayHelloWorld extends AbstractSay {


    public SayHelloWorld(Color c1, Star s1) {
        super(c1, s1);
    }

    @Override
    public void say() {
        System.out.print(this.color1.getColorName());

        for (int i = 0; i < this.star.getSize(); i++) {
            System.out.print("*");
        }
        System.out.print("hello world!");

        for (int i = 0; i < this.star.getSize(); i++) {
            System.out.print("*");
        }
    }
}
