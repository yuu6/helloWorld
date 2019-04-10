package com.yuu6.helloWorld.behavioralPattern.observerPattern;

public class Main {
    public static void main(String[] args) {
        CharGroup charGroup = new CharGroup();
        MyChar myChar = new MyChar(':',charGroup);
        charGroup.addChar(new MyChar('h',charGroup));
        charGroup.addChar(new MyChar('e',charGroup));
        charGroup.addChar(new MyChar('l',charGroup));
        charGroup.addChar(new MyChar('l',charGroup));
        charGroup.addChar(new MyChar('o',charGroup));
        charGroup.addChar(new MyChar(' ',charGroup));
        charGroup.addChar(new MyChar('w',charGroup));
        charGroup.addChar(new MyChar('o',charGroup));
        charGroup.addChar(new MyChar('r',charGroup));
        charGroup.addChar(new MyChar('l',charGroup));
        charGroup.addChar(new MyChar('d',charGroup));

        myChar.myNotify();
    }
}
