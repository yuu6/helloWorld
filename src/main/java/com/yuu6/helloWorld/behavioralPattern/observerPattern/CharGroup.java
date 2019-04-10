package com.yuu6.helloWorld.behavioralPattern.observerPattern;

import java.util.ArrayList;

public class CharGroup {
    private ArrayList<MyChar> chars = new ArrayList<>();
    private int lens = 0;

    public void addChar(MyChar myChar){
        chars.add(lens++,myChar);
    }

    public void myNotify(MyChar myChar) {
        for (int i = 0; i < lens; i++) {
            if (chars.get(i) != myChar) {
                chars.get(i).print();
            }
        }
    }
}
