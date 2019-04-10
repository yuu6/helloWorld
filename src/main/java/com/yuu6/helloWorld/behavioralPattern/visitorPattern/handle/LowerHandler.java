package com.yuu6.helloWorld.behavioralPattern.visitorPattern.handle;

import com.yuu6.helloWorld.behavioralPattern.visitorPattern.MyChar;

/**
 * 小写输出
 *
 */
public class LowerHandler implements Handler {
    @Override
    public void visit(MyChar myChar) {
        System.out.print(Character.toLowerCase(myChar.getA()));
    }
}
