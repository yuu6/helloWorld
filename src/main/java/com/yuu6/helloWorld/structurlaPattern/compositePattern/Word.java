package com.yuu6.helloWorld.structurlaPattern.compositePattern;

import com.yuu6.helloWorld.structurlaPattern.decoratePattern.Say;


public class Word implements Say {
    private static int DEFAULT_SIZE = 10;
    private int CURRENT_SIZE;
    Say[] word;
    private int length = 0;

    public Word() {
        this(DEFAULT_SIZE);
    }

    public Word(int len) {
        CURRENT_SIZE = DEFAULT_SIZE;
        word = new Say[CURRENT_SIZE];
    }

    public int addChar(Say a) {
        try {
            if (length == CURRENT_SIZE) {
                Say[] oldWord = word;
                // 先扩容
                word = new Say[CURRENT_SIZE * 2];
                for (int i = 0; i < CURRENT_SIZE; i++) {
                    word[i] = oldWord[i];
                }
            }
            word[length++] = a;
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
        return 1;
    }


    @Override
    public void say() {
        for (int i = 0; i < length; i++) {
            word[i].say();
        }
    }
}
