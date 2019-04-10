package com.yuu6.helloWorld.behavioralPattern.visitorPattern.handle;

import com.yuu6.helloWorld.behavioralPattern.visitorPattern.MyChar;

public interface Handler {
    public void visit(MyChar myChar);
}
