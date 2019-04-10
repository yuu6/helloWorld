package com.yuu6.helloWorld.behavioralPattern.visitorPattern;

import com.yuu6.helloWorld.behavioralPattern.visitorPattern.handle.Handler;

import java.util.ArrayList;

public class CharGroup {
    ArrayList<MyChar> chars = new ArrayList<>();
    private int lens = 0;

    public void addChar(MyChar myChar) {
        chars.add(lens++, myChar);
    }

    public void print(Handler handler) {
        for (int i = 0; i < lens; i++) {
            chars.get(i).handle(handler);
        }
    }

}
