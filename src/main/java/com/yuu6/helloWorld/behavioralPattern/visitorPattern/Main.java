package com.yuu6.helloWorld.behavioralPattern.visitorPattern;

import com.yuu6.helloWorld.behavioralPattern.visitorPattern.handle.Handler;
import com.yuu6.helloWorld.behavioralPattern.visitorPattern.handle.LowerHandler;
import com.yuu6.helloWorld.behavioralPattern.visitorPattern.handle.UpperHandler;

public class Main {
    public static void main(String[] args) {
        CharGroup charGroup = new CharGroup();
        charGroup.addChar(new MyChar('h'));
        charGroup.addChar(new MyChar('e'));
        charGroup.addChar(new MyChar('l'));
        charGroup.addChar(new MyChar('l'));
        charGroup.addChar(new MyChar('o'));
        charGroup.addChar(new MyChar(' '));
        charGroup.addChar(new MyChar('w'));
        charGroup.addChar(new MyChar('o'));
        charGroup.addChar(new MyChar('r'));
        charGroup.addChar(new MyChar('l'));
        charGroup.addChar(new MyChar('d'));
        charGroup.addChar(new MyChar('!'));

        Handler upperHandler = new UpperHandler();
        Handler lowerHandler = new LowerHandler();
        charGroup.print(lowerHandler);
        System.out.println();
        charGroup.print(upperHandler);
    }
}
