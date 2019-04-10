package com.yuu6.helloWorld.behavioralPattern.visitorPattern.handle;

import com.yuu6.helloWorld.behavioralPattern.visitorPattern.MyChar;

/**
 * 大写输出
 *
 */
public class UpperHandler implements Handler {
    @Override
    public void visit(MyChar myChar) {
        System.out.print(Character.toUpperCase(myChar.getA()));
    }
}
